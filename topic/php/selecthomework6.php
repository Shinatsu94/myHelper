<?php
/*
version: 1.0.2
update : 2025-09-17
editor : PIN CHEN, TSAI
detail :
 - 修改呼叫SQL參數(Session 認證)的邏輯
*/
declare(strict_types=1);
session_start();

@set_time_limit(300);       // 最多跑 5 分鐘
@ignore_user_abort(true);   // 瀏覽器關掉也繼續跑

// 1) 取得參數（Session 驗證）
// 關聯檔案 "php/selectclass.php" "php/selecthomework.php"
$classID    = (int)($_SESSION['selected_class_id']    ?? 0);
$homeworkID = (int)($_SESSION['selected_homework_id'] ?? 0);

if ($classID == 0 || $homeworkID == 0) {
    // 若遺失任何資訊，請先點選 編輯作業的按鈕，將會觸發取得相關資訊
    http_response_code(401);
    exit("課程或作業資訊遺失 (classID = {$classID}, homeworkID = {$homeworkID})。\n若遺失任何資訊，請先點選 編輯作業的按鈕，將會觸發取得相關資訊");
}

// 2) 路徑組好
$baseDir = dirname(__DIR__) . '/data' . "/$classID/$homeworkID"; // 作業根
$topicDir = $baseDir . '/homework_texts'; // 題目資料夾
$files = glob($topicDir . '/Q*.txt') ?: []; // 找出所有 Q*.txt 檔
natsort($files); // 讓 Q1, Q2, Q10 依自然順序

$topicPath = $files ? array_values($files)[0] : null; // 取第一個題目檔
$scriptPath = dirname(__DIR__) . '/LingoBridge/WebtoLB.py'; // 腳本

// 遞迴找 homework/ 下的第一個 .java（名稱不限）——不做任何檢查
$javaFiles = [];
$iter = new RecursiveIteratorIterator( 
    new RecursiveDirectoryIterator($baseDir . '/homework', FilesystemIterator::SKIP_DOTS) // 遞迴列出所有檔案
);
foreach ($iter as $f) {
    if ($f->isFile() && strtolower($f->getExtension()) === 'java') {
        $javaFiles[] = $f->getPathname(); // 找到就加入陣列
    }
}
natsort($javaFiles); // 讓檔案依自然順序
$javaFiles = array_values($javaFiles); // 重建索引
$codePath  = $javaFiles[0] ?? '';  // 若沒找到，給空字串以避免 TypeError

$javaFiles = glob($baseDir . '/homework/*/Q*/' . '*.java'); // 找出所有 Q*.java 檔

foreach ($javaFiles as $codePath) {

    // 3) 檢查路徑
    if (!is_file($scriptPath) || !is_readable($scriptPath)) {
        http_response_code(500);
        exit('無法存取 WebtoLB.py 腳本，請聯繫管理員');
    }
    if (!is_dir($baseDir)) {
        http_response_code(404);
        exit('作業資料夾不存在，請確認作業 ID 是否正確');
    }
    if (!is_file($topicPath) || !is_readable($topicPath)) {
        http_response_code(404);
        exit('題目檔不存在，請聯繫管理員');
    }
    if (!is_file($codePath) || !is_readable($codePath)) {
        http_response_code(404); 
        exit('程式碼檔不存在，請確認作業是否已繳交');
    }

    // 4) 執行 Python
    $python = 'python';
    $cmd = implode(' ', [ // 組合命令列
        escapeshellarg($python),
        escapeshellarg($scriptPath), // 腳本
        escapeshellarg($topicPath), // 題目
        escapeshellarg($codePath), // 程式
    ]);

    // debug. 2>&1：把 stderr(2) 重新導向到 stdout(1)，因此錯誤訊息也會被收集到 $out。
    $out = [];
    exec($cmd . ' 2>&1', $out, $rc); // 執行並取得回傳值
    if ($rc !== 0) { // 失敗
        header('Content-Type: text/plain; charset=utf-8');
        echo "RC=$rc\n" . implode("\n", $out); // 顯示錯誤訊息
        exit;
    }

    // 5) 複製到其他路徑（例如 data/output.log）
    $filegemini = __DIR__ . "/../LingoBridge/data/temp/feedback"; // 來源檔案
    $srcPath = realpath($filegemini); // 嘗試正規化路徑
    $dstDir = dirname($codePath) . DIRECTORY_SEPARATOR . "feedback" . DIRECTORY_SEPARATOR; // 目標資料夾

    // 確認來源檔案存在
    if (!file_exists($srcPath)) {
        echo "找不到來源檔案: $srcPath<br>";
        exit;
    }

    // 確保目標目錄存在
    if (!is_dir($dstDir)) {
        mkdir($dstDir, 0777, true);
    }

    // 在目標資料夾裡，用來源檔案的檔名
    $savePath = $dstDir . "Gemini_feedback.txt";
    // 若要 Mistral 回饋，改這行即可
    // $savePath = $dstDir . "Mistral_feedback.txt";

    // // debug:確認路徑是否正確
    // echo "來源: $srcPath<br>"; 
    // echo "目標: $savePath<br>";

    // 執行複製
    if (copy($srcPath, $savePath)) {
        echo "複製成功: $savePath";
    } else {
        echo "複製失敗";
    }

} // end foreach

// 6) 轉頁
header("Location: ../homeworkscoresedit.php"); 
exit;
?>