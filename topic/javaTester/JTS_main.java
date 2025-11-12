/*
project : JavaTesterSystem
author  : PIN CHEN, TSAI
version : v3.0.3
updated : 2025-10-22
detail  :
- 執行方式如下:
```
java JTS_main.java
java JTS_main.java <FileDir> <testcaseDir>
```
errorCode:
-1 : 未通過
0  : 通過
401: 不支援的檔案類型
402: 找不到待批改作業
403: 找不到輸出測資
404: 非預期回傳結果
500: 主程式非預期錯誤
501: 錯誤的引數
999: 超時

WorkLog:
- 超時判定優化 (v3.0.2)

*/

//--- IMPORT--------------------------------------------+
import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class JTS_main {
    
//--- VARIABLE------------------------------------------+
    static int MODE = 0;                 // 0=本地模式 1=呼叫模式
    static String FILE_DIR = "Homeworks"; // 預設作業路徑
    static String TEST_DIR = "Testcases"; // 預設測資路徑
    static String LOGS_DIR = "logs";      // 工作日誌路徑
    static Path HW_DIR, TC_DIR, LG_DIR;

    // 資料載入時間
    static String NOWTIME;

    // 支援的作業格式
    static String[] CODE_TYPES = {"java", "py", "exe"};

    // 中斷訊號旗標
    static boolean INTERRUPTED = false;

//--- INITIAL-------------------------------------------+
    private static void init() throws Exception {
        HW_DIR = Paths.get(FILE_DIR);
        TC_DIR = Paths.get(TEST_DIR);
        LG_DIR = Paths.get(LOGS_DIR);
        
        // 建立資料夾 (若不存在)
        if (MODE == 0) {
            for (Path p : List.of(HW_DIR, TC_DIR, LG_DIR)) {
                if (!Files.exists(p)) {
                    Files.createDirectories(p);
                    System.out.println("【JTS】 已新增 " + p.getFileName() + "資料夾。");
                }
            }
        }

        // 更新時間
        NOWTIME = DateTimeFormatter.ofPattern("yyMMdd_HHmmssSS").format(LocalDateTime.now()); // eg. 250909_1858
    }

//--- FUNCTIONS-----------------------------------------+
    private static int runProgram(File targetFile, File outFile) throws Exception {
        String fileName = targetFile.getName();
        String execCmd;

        // 依據副檔名決定執行方式
        if (fileName.endsWith(".java")) {
            execCmd = "java " + fileName;
        } else if (fileName.endsWith(".py")) {
            execCmd = "python " + fileName;
        } else if (fileName.endsWith(".exe")) {
            execCmd = fileName;
        } else {
            return 401; // 不支援的檔案類型
        }

        // 建立 ProcessBuilder
        ProcessBuilder pb = new ProcessBuilder(execCmd.split(" "));
        pb.directory(targetFile.getParentFile()); // 設定執行路徑
        pb.redirectErrorStream(true); // 將錯誤流合併至輸出流中

        // 對應測資輸入
        Path inPath = outFile.toPath().resolveSibling(outFile.getName().replace(".out", ".in"));
        File inFile = inPath.toFile();
        if (inFile.exists()) {
            // 如果輸入測資存在
            pb.redirectInput(inFile);
        }

        // 開始時間
        long Stime = System.currentTimeMillis();
        // 開始執行
        Process p1 = pb.start();

        /*
        // Ctrl+C 中斷監聽
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("\n【JTS】偵測到 Ctrl+C，中止程序...");
            INTERRUPTED = true;
            p1.destroyForcibly();
        }));
        */

        // 非阻塞式讀取 stdout
        List<String> actual = new ArrayList<>();
        Thread readerThread = new Thread(() -> {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(p1.getInputStream()))) {
                String line;
                while ((line = br.readLine()) != null) {
                    actual.add(line);
                }
            } catch (IOException ignored) {}
        });
        readerThread.start();

        // 程式碼超時判定
        boolean finished = p1.waitFor(5, TimeUnit.SECONDS);
        if (!finished) {
            p1.destroyForcibly(); // 強制結束程式
            return 999; // 超時
        }

        // 程式碼回傳結果
        int exitCode = p1.exitValue();
        // if (exitCode != 0) return 404; // 非預期回傳結果

        // 輸出測資
        List<String> expected = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(outFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                expected.add(line);
            }
        }

        // 比對輸出
        boolean same = actual.equals(expected);
        long Etime = System.currentTimeMillis();
        long elapsed = Etime - Stime; // 總耗時長

        // 回傳結果 (0=通過 -1=未通過)
        return same ? 0 : -1;
    }

//--- MAIN----------------------------------------------+
    public static void main(String[] args) {
        try {
            // 1. 檢查引數
            if (args.length == 0) {
                MODE = 0;
            } else if (args.length == 2) {
                MODE = 1;
                FILE_DIR = args[0];
                TEST_DIR = args[1];
            } else {
                System.out.println("[Usage_batch] java JTS_main.java");
                System.out.println("[Usage_return] java JTS_main.java <FileDir> <testcaseDir>");
                System.exit(501); // 錯誤的引數
            }

            // 2. 初始化
            init();

            // 3. 讀取作業與測資
            String regex = String.join("|", CODE_TYPES); // 支援格式清單
            File[] code_files = HW_DIR.toFile().listFiles((dir, name) -> name.matches(".*\\.(" + regex + ")$"));
            File[] out_files  = TC_DIR.toFile().listFiles((dir, name) -> name.endsWith(".out"));
            if (code_files == null || code_files.length == 0) {
                System.out.println("【JTS】 找不到待批改作業。");
                System.exit(402); // 找不到待批改作業
            }
            if (out_files == null || out_files.length == 0) {
                System.out.println("【JTS】 找不到輸出測資。");
                System.exit(403); // 找不到輸出測資
            }
            System.out.printf("【JTS】 共載入 %d 份作業，%d  組測資。\n", code_files.length, out_files.length);

            // 4. 批改主流程
            List<String> logs = new ArrayList<>();
            int failed = 0;
            for (File hw : code_files) {
                if (INTERRUPTED) break;
                int result = 0;
                for (File oc : out_files) {
                    result = runProgram(hw, oc);
                    if (result != 0) break; // 如未通過則不再測其他測資
                }
                
                String log_msg = switch (result) {
                    case 0 -> hw.getName() + " -> ✅ 通過";
                    case -1 -> hw.getName() + " -> ❌ 未通過";
                    case 401 -> hw.getName() + " -> ⚠️ 不支援的格式";
                    case 404 -> hw.getName() + " -> ⚠️ 非預期結果";
                    case 999 -> hw.getName() + " -> ⏰ 超時未結束";
                    default -> hw.getName() + " -> ❓ 未知錯誤";
                };

                if (result != 0) failed++;
                logs.add(log_msg);
                System.out.println("  " + log_msg);
            }
            System.out.println();

            // 5. 寫入工作日誌
            if (MODE == 0) {
                Path logFile = LG_DIR.resolve(NOWTIME + ".log");
                try (BufferedWriter bw = Files.newBufferedWriter(logFile)) {
                    for (String s : logs) {
                        bw.write(s + System.lineSeparator());
                    }
                }
                System.out.println("【JTS】 日誌已儲存於 " + logFile);
            }

            // 6. 結束程式
            if (failed == 0) {
                System.out.println("【JTS】 ✅ 所有作業通過測資");
                System.exit(0);
            } else {
                System.out.printf("【JTS】 ❌ %d 份作業未通過測資\n", failed);
                System.exit(-1);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(500); // 主程式非預期錯誤
        }
    }
}

//--- END-----------------------------------------------+
