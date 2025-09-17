<?php
declare(strict_types=1);
session_start();

/**
 * 一鍵批改：掃描 submissions/ 下的所有 .java
 * 對每個檔案呼叫 Python（你的 LingoBridge），將講評寫入 feedbacks/
 *
 * 需求：
 * - 已設定 $_SESSION['selected_class_id'], $_SESSION['selected_homework_id'], $_SESSION['UserID']
 * - Windows + XAMPP（若 Linux 請把 $python 路徑改為 'python3'）
 */

if (!isset($_SESSION['selected_class_id'], $_SESSION['selected_homework_id'], $_SESSION['UserID'])) {
    http_response_code(401);
    exit('未登入或 Session 遺失');
}

$classID   = (int)$_SESSION['selected_class_id'];
$homeworkID= (int)$_SESSION['selected_homework_id'];
$teacherID = (int)$_SESSION['UserID'];

$baseDir   = dirname(__DIR__) . "/topic/data/$classID/$homeworkID";
$topicDir  = $baseDir . "/homework_texts";
$subsDir   = $baseDir . "/submissions";
$fbDir     = $baseDir . "/feedbacks";

if (!is_dir($baseDir)) {
    http_response_code(404);
    exit('作業資料夾不存在');
}
if (!is_dir($subsDir)) {
    http_response_code(400);
    exit('缺 submissions/ 目錄，請先放入學生程式');
}
if (!is_dir($topicDir)) {
    http_response_code(400);
    exit('缺 homework_texts/ 目錄，請放入題目 Q1.txt');
}
if (!is_dir($fbDir)) {
    mkdir($fbDir, 0777, true);
}

/** 選題：預設 Q1.txt；如需切換題號，改這裡即可 */
$topicFile = $topicDir . "/Q1.txt";
if (!is_file($topicFile)) {
    http_response_code(400);
    exit("找不到題目檔：$topicFile");
}

/** 可選：你的評分規範/提示（若無則讓 Python 用預設） */
$quizFileOpt = $topicDir . "/quiz.txt";
$quizArg = is_file($quizFileOpt) ? $quizFileOpt : "";

/** Python 腳本與直譯器（依你的環境調整） */
$python = 'C:\Users\justi\AppData\Local\Programs\Python\Python313\python.exe';
$script = realpath(dirname(__DIR__) . '/topic/LingoBridge/WebtoLB.py');
if (!$script) {
    http_response_code(500);
    exit('找不到 Python 腳本 WebtoLB.py');
}

/** 可選：在這裡注入 LLM API Key（只影響本次子程序） */
// putenv('OPENAI_API_KEY=sk-xxxxx');
// putenv('GEMINI_API_KEY=xxxxxx');
// putenv('MISTRAL_API_KEY=xxxxxx');

$javaFiles = glob($subsDir . '/*.java');
if (!$javaFiles) {
    exit('submissions/ 下找不到任何 .java，請先上傳學生程式');
}

$report = [];
$failed = 0;
foreach ($javaFiles as $javaPath) {
    $stuBase = pathinfo($javaPath, PATHINFO_FILENAME);  // s001
    $outPath = $fbDir . "/{$stuBase}_feedback.txt";

    // 組指令：WebtoLB.py <題目路徑> <學生程式路徑> [可選：quiz路徑]
    $cmd = $python . ' ' . escapeshellarg($script) . ' ' .
        escapeshellarg(str_replace('\\','/',$topicFile)) . ' ' .
        escapeshellarg(str_replace('\\','/',$javaPath));

    if ($quizArg !== "") {
        $cmd .= ' ' . escapeshellarg(str_replace('\\','/',$quizArg));
    }
    $cmd .= ' 2>&1';

    $out = [];
    $code = 0;
    exec($cmd, $out, $code);

    $joined = implode("\n", $out);

    // 備援：若腳本沒正確回傳非 0，看到「【ERROR】」也視為失敗
    $hasErrorMark = (bool)preg_match('/【ERROR】/u', $joined);

    if ($code === 0 && !$hasErrorMark) {
        // 成功：把 LLM 的完整講評存檔
        file_put_contents($outPath, $joined);
        $report[] = "✅ {$stuBase} → 產生 {$stuBase}_feedback.txt";
    } else {
        $failed++;
        // 記錄錯誤輸出
        file_put_contents($outPath . '.log', $joined);
        $report[] = "❌ {$stuBase} 失敗（詳見 feedbacks/{$stuBase}_feedback.txt.log）";
        error_log("AutoGrade failed for {$stuBase} (code=$code):\n".$joined);
    }
}

// 回顯簡單報告
header('Content-Type: text/plain; charset=utf-8');
echo "=== 批次批改完成 ===\n";
echo "ClassID: $classID  HomeworkID: $homeworkID\n";
echo "題目：$topicFile\n";
if ($quizArg) echo "規範：$quizArg\n";
echo "--------------------------------------\n";
echo implode("\n", $report) . "\n";
echo "--------------------------------------\n";
echo $failed === 0 ? "全部成功 🎉\n" : "失敗件數：$failed（請檢查 .log）\n";
