<?php
/*
version: 1.1.1
update : 2025-11-11
editor : PIN CHEN, TSAI
detail :
 - 該段程式碼負責進行網頁資料與 LB 系統 的溝通，透過 WebtoLB.py 進行通話
 - WebtoLB.py 負責將 提問句、作業題目、作業程式碼 三份文本合併成一份，
   透過 main.py 向 LingoBridge 取得 LLM 回饋
 - 將 WebtoLB.py 回傳的內容打包成文字檔案，並儲存至指定路徑

worklog:
- 將回饋輸出以 UTF-8輸出
*/
declare(strict_types=1);
session_start();

@set_time_limit(18000);       // 最多跑 300 分鐘
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

// 2) 路徑設定
$baseDir   = dirname(__DIR__) . "/data/{$classID}/{$homeworkID}"; // 作業根目錄
$topicDir  = $baseDir . '/homework_texts'; // 題目資料夾
//$files     = glob($topicDir . '/Q*.txt') ?: []; // 找出所有題目文本
//natsort($files); // 讓 Q1, Q2, Q10 依自然順序
//$topicPath = $files ? array_values($files)[0] : null; // 取第一個題目檔
$scriptPath = dirname(__DIR__) . '/LingoBridge/WebtoLB.py'; // 呼叫 LB系統 的腳本

// 3) 找出所有學生程式碼檔案
// 遞迴找 homework/ 下的第一個 .java（名稱不限）——不做任何檢查
$javaFiles = glob($baseDir . '/homework/Q*/' . '*/' . '*.java'); // e.g. homework/Q1/11/main.java
natsort($javaFiles);

foreach ($javaFiles as $codePath) {

    // --- 檢查LB 系統腳本是否存在 ---
    if (!is_file($scriptPath) || !is_readable($scriptPath)) {
        http_response_code(500);
        exit('無法呼叫 LB 系統腳本，請聯繫管理員');
    }

    // --- 根據 codePath 推導 Q題號 與 學生編號 ---
    // 範例： /data/1/2/homework/Q1/11/main.java
    $relative = str_replace($baseDir . '/homework/', '', $codePath); // 取得相對路徑 Q1/11/main.java
    $parts = explode('/', $relative);
    $questionID = $parts[0] ?? 'Qx'; // Q1
    $studentID  = $parts[1] ?? 'unknown'; // 11

    // --- 檢查對應題目 ---
    $topicPath = "{$topicDir}/{$questionID}.txt";
    if (!is_file($topicPath) || !is_readable($topicPath)) {
        http_response_code(404);
        exit('題目檔不存在，請聯繫管理員');
    }

    // --- 檢查對應作業 ---
    if (!is_file($codePath) || !is_readable($codePath)) {
        echo "⚠️ 找不到程式碼檔案：{$codePath}\n";
        continue;
    }

    // --- 執行 LingoBridge ---
    $python = 'python';
    $cmd = implode(' ', [
        escapeshellarg($python),
        escapeshellarg($scriptPath), // 腳本
        escapeshellarg($topicPath),  // 題目
        escapeshellarg($codePath),   // 程式
    ]);

    // debug. 2>&1：把 stderr(2) 重新導向到 stdout(1)，因此錯誤訊息也會被收集到 $out。
    $out = [];
    exec($cmd . ' 2>&1', $out, $rc); // 執行並取得回傳值

    // 如果通訊失敗
    if ($rc !== 0) {
        echo "⚠️ 無回傳內容: {$codePath}\n";
        continue;
    }

    // 將 Python 回傳的文字整合
    $feedback_text = trim(implode("\n", $out));
    // 如果編碼不為 UTF-8時，進行編碼轉換
    if (!mb_check_encoding($feedback_text, 'UTF-8')) {
        $feedback_text = mb_convert_encoding($feedback_text, 'UTF-8', 'BIG5');
    }

    // 檢視輸出結果 (除錯用)
    /*
    echo "<pre>";
    print_r($feedback_text);
    echo "</pre>";
    exit;
    */

    // --- 組合最終輸出路徑 ---
    $feedbackDir  = "{$baseDir}/feedback/{$questionID}/{$studentID}";
    $feedbackFile = "{$feedbackDir}/gpt-5-nano_feedback.txt";

    // 確保目標目錄存在
    if (!is_dir($feedbackDir)) {
        mkdir($feedbackDir, 0777, true);
    }

    // --- 寫入結果 ---
    file_put_contents($feedbackFile, $feedback_text);

    echo "[✅ 已產生回饋] {$feedbackFile}\n";
}

// 6) 轉頁
header("Location: ../homeworkscoresedit.php");
exit;
?>
