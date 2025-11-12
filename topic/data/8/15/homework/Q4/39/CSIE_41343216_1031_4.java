import java.util.Scanner;  // 1️⃣ 匯入 Scanner 讓我們能輸入資料

public class Main {        // 2️⃣ 建立主類別 Main
    public static void main(String[] args) {  // 3️⃣ 主程式進入點
        Scanner sc = new Scanner(System.in);  // 4️⃣ 建立 Scanner 物件讀取輸入

        int n = sc.nextInt();   // 5️⃣ 讀取陣列高度 n
        int num = sc.nextInt(); // 6️⃣ 讀取要尋找的數字

        int[][] arr = new int[n][];  // 7️⃣ 宣告二維不規則陣列（下三角形）

        int count = 1;  // 8️⃣ 用來依序填入數字的變數

        for (int i = 0; i < n; i++) {   // 9️⃣ 外層迴圈控制列數
            arr[i] = new int[i + 1];    // 🔟 每列建立 i+1 個元素

            for (int j = 0; j <= i; j++) {   // 11️⃣ 內層迴圈控制欄數
                arr[i][j] = count;           // 12️⃣ 填入數字
                count++;                     // 13️⃣ 下一個數字
            }
        }

        // 14️⃣ 搜尋 num 是否存在
        boolean found = false;  // 紀錄是否找到
        for (int i = 0; i < n && !found; i++) {  // 15️⃣ 搜尋每一列
            for (int j = 0; j <= i; j++) {       // 16️⃣ 搜尋每一欄
                if (arr[i][j] == num) {          // 17️⃣ 找到目標數字
                    System.out.println(num + "[" + (i + 1) + ", " + (j + 1) + "]"); // 18️⃣ 輸出位置
                    found = true;                // 19️⃣ 標記為找到
                    break;                       // 20️⃣ 跳出內層迴圈
                }
            }
        }

        if (!found) {  // 21️⃣ 若沒找到，印出提示訊息
            System.out.println("not find " + num + " in array.");
        }
    }
}
