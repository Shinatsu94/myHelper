<?php
// ------------------------------------------------------------------------------+
//    PROJECT : uploadhomework.php
//    AUTHOR  : PIN CHEN, TSAI
//    VERSION : v1.0
//    UPDATE  : 2025-08-07
// ------------------------------------------------------------------------------+

session_start(); // 啟動或恢復 PHP Session，用於儲存使用者狀態資訊 (例如 UserID, homeworkID, 錯誤訊息等)。

// --- 全域常數定義 (設定檔區塊) ---
// 這些常數定義了資料庫連線資訊、檔案系統路徑等，方便集中管理和修改。

// 資料庫連線設定 (這些將不再被使用，但保留以供參考，或者如果以後要恢復部分資料庫功能)
/*
define('DB_HOST', 'localhost');
define('DB_USER', 'root');
define('DB_PASS', '');
define('DB_NAME', 'topic');
*/

// 檔案路徑設定 (可於Window Linux雙平台上執行)
// 使用 __DIR__ 取得當前路徑，不再寫死路徑。
// Java 和 Python 相關路徑，這裡僅保留定義，實際程式碼中將不使用
define('UPLOAD_BASE_DIR', __DIR__ . '/../data/'); // 上傳檔案的基礎目錄，它會在 TOPIC_ROOT_DIR 下的 'data/' 目錄。
define('JAVA_TESTER_PATH', __DIR__ . '/../javaTester/'); // 測資批改系統(javaTester)的目錄。


// 該段落用於AI批改系統，原本於上傳作業時同步進行。
// 目前以批改測資系統取代之，未來AI批改預計改為教師手動觸發，或作業已截止且學生觸發回饋畫面。

// 在手動系統上線前，替代方案如下供參考:
// 如果學生程式碼正確無誤且通過測資，則進行AI批改並新增回饋，以確保後續功能如期運行。
// 反之則不存入資料庫，且作業顯示未繳交(因功能不完整)。
define('LINGOBRIDGE_PATH', __DIR__ . '../LingoBridge/LingoBridge_v1.1.py'); // LB系統路徑，用於AI批改。
define('PYTHON_PATH', 'python');                  // Python 路徑，作用於AI批改中。
// define('GEMINI_SCRIPT_PATH', __DIR__ . '/../py/Gemini.py'); // Gemini 腳本路徑，用於AI批改。
// define('MISTRAL_SCRIPT_PATH', __DIR__ . '/../py/Mistral.py'); // Mistral 腳本路徑，用於AI批改。

exec(PYTHON_PATH . ' --version', $output, $returnCode);
if($returnCode !== 0) die("Python not found. Please report to admin to install Python or set PATH."); //找不到Python，請安裝Python或設定環境變數（PATH）。


// --- 輔助函數定義 ---
// 這裡只保留了錯誤處理和重定向函數，其他與資料庫/AI 相關的函數已被移除。

/**
 * 統一的錯誤處理和重定向函數。
 * 設定 Session 錯誤訊息，然後將使用者重定向到上傳頁面並終止腳本。
 * @param string $errorMessage 要顯示給使用者的錯誤訊息。
 */
function redirectToUploadPage($errorMessage) {
    $_SESSION['error'] = $errorMessage; // 將錯誤訊息儲存到 Session 中，以便在跳轉後顯示
    header("Location: ../uploadhomework.php"); // 重定向到上傳作業的頁面
    exit(); // 終止腳本執行，防止後續代碼運行
}

// 與分數提取和資料庫儲存相關的函數已被移除或註解掉
/*
function extractScore($content, $keywords) { ... }
function saveAiScoreToDb($conn, $homeworkID, $userid, $questionID, $llmType, $score) { ... }
*/


// --- 主程式邏輯開始 ---

// 1. 請求方法驗證
if ($_SERVER['REQUEST_METHOD'] !== 'POST') {
    redirectToUploadPage("無效的請求方法！請透過表單提交。");
}

// 2. 獲取並驗證輸入參數和 Session 資訊
$questionID = $_POST['Question_id'] ?? null; // 獲取題目 ID
$file = $_FILES['file'] ?? null;           // 獲取上傳的檔案資訊

$userid = $_SESSION['UserID'] ?? null;           // 從 Session 獲取使用者 ID
$homeworkID = $_SESSION['selected_homework_id'] ?? null; // 從 Session 獲取選定的作業 ID

// 檢查所有必要資訊是否存在且上傳檔案無錯誤
if (!$questionID || !$file || $file['error'] !== UPLOAD_ERR_OK || !$userid || !$homeworkID) {
    redirectToUploadPage("上傳資訊不完整或檔案上傳發生錯誤。請檢查後重試。錯誤代碼: " . ($file['error'] ?? '未知'));
}

// 3. 資料庫連線 (此處僅為獲取 ClassID 的臨時資料庫操作，可視為已被移除大部分功能)
// 在這個精簡版中，我們假設 ClassID 可以被直接取得或固定，或者這部分邏輯會被替換。
// 由於你希望只保留上傳，這部分資料庫操作暫時保留，因為它影響了 $classID 的獲取。
// 如果 $classID 是固定值，你可以直接定義它而不是從資料庫查詢。
$conn = new mysqli('localhost', 'root', '', 'topic'); // 建立資料庫連線

// 檢查資料庫連線是否成功
if ($conn->connect_error) {
    redirectToUploadPage("資料庫連線失敗，無法獲取 ClassID。錯誤: " . $conn->connect_error);
}

// 4. 查詢作業列表以獲取 ClassID (保留此部分以獲取 $classID，這是上傳路徑所需)
// 為了精簡，我們只保留獲取 ClassID 的最基本查詢。
$stmt = $conn->prepare("SELECT ClassID FROM homeworkslist WHERE HomeworkID = ?");
if (!$stmt) {
    redirectToUploadPage("準備查詢 ClassID 失敗，請聯繫管理員。錯誤: " . $conn->error);
}
$stmt->bind_param("s", $homeworkID);
$stmt->execute();
$result = $stmt->get_result();

if ($result->num_rows === 0) {
    $stmt->close();
    $conn->close();
    redirectToUploadPage("找不到對應的作業資訊，無法獲取 ClassID。");
}
$row = $result->fetch_assoc();
$classID = $row['ClassID'];
$stmt->close();


// 5. 處理檔案上傳和目錄管理 (核心功能)

// 作業題目的完整路徑
$HWtextPath = UPLOAD_BASE_DIR . "$classID/$homeworkID/homework_texts/Q$questionID.txt";

// 學生作業的上傳目錄路徑
// eg.  "C:/xampp/htdocs/topic/data/" . "6/1/homework/Q1/100/"
$uploadDir = UPLOAD_BASE_DIR . "$classID/$homeworkID/homework/Q$questionID/$userid/";

// 測資路徑
// eg.  "C:/xampp/htdocs/topic/data/" . "6/1/tester/Q1/"
$testerDir = UPLOAD_BASE_DIR . "$classID/$homeworkID/tester/Q$questionID/";

// 獲取上傳檔案的基本名稱 (例如: mycode.java，不包含路徑)
$filename = basename($file['name']);
// 組合上傳檔案的最終目標路徑
$target = $uploadDir . $filename;

// 檢查並建立上傳目錄。如果目錄不存在，則嘗試建立，並賦予 0777 權限 (讀、寫、執行給所有者、群組及其他人)。
// true 參數允許建立巢狀目錄。
if (!is_dir($uploadDir)) {
    if (!mkdir($uploadDir, 0777, true)) {
        $conn->close();
        redirectToUploadPage("無法建立作業上傳目錄。請檢查伺服器權限。");
    }
}

// 清空該題目資料夾中的所有舊檔案。
// 這樣做是為了避免舊檔案干擾新的測試或僅保留最新的上傳。
$filesInDir = glob($uploadDir . '*');
foreach ($filesInDir as $fileToDelete) {
    if (is_file($fileToDelete)) {
        unlink($fileToDelete); // 刪除檔案
    }
}

// 將暫存的上傳檔案移動到目標目錄
if (move_uploaded_file($file['tmp_name'], $target)) {
    $_SESSION['report'] = "檔案上傳成功！"; // 上傳成功訊息
} else {
    $_SESSION['error']  = "檔案上傳失敗！請重試或聯繫管理員。"; // 上傳失敗訊息
}


// --- Java 測資批改(批改程式系統) ---


// 宣告批改程式系統完整路徑
$testerSys = JAVA_TESTER_PATH . "JTS_main.java";

// 批改系統執行指令
// escapeshellarg()會將字串包裝成安全的 shell 引數格式，防止特殊字元導致的命令注入攻擊。
// "Usage: java JTS_main.java <FileDir> <testcaseDir>"
$javaCmd = 'java ' . $testerSys . ' ' . $uploadDir . ' ' . $testerDir;

// 定義輸入/輸出管道
$descriptorspec = [
    0 => ['pipe', 'r'],  // stdin
    1 => ['pipe', 'w'],  // stdout
    2 => ['pipe', 'w'],  // stderr
];

// 設定超時時間
$timeout   = 5; //單位: secend

//執行批改(v2.0)
$process = proc_open($javaCmd, $descriptorspec, $pipes);

if(is_resource($process)){
    // 設定成非阻塞式，避免被卡住
    stream_set_blocking($pipes[1], false);
    stream_set_blocking($pipes[2], false);
    
    $output = '';
    $errorOutput = '';
    $start = time();
    
    while(true){
        $status = proc_get_status($process);
        if(!$status['running']) break;
        
        $now = time();
        if($now - $start > $timeout){
            // 如果timeout，強制停止
            proc_terminate($process, 9); // SIGKILL
            $javaReturn = 17;
            break;
        }
        
        // 嘗試讀取部分輸出 (避免卡住)
        $output .= fread($pipes[1], 1024);
        $errorOutput .= fread($pipes[2], 1024);
        
        usleep(100000); // 0.1 秒延遲，避免吃滿 CPU
    }
    
    // 關閉管道
    fclose($pipes[0]);
    fclose($pipes[1]);
    fclose($pipes[2]);
    
    // 若未超時，取得測資批改系統的回傳值
    if(!isset($javaReturn)){
        $javaReturn = proc_close($process);
    }
}else{
    $javaReturn = 127; // 指令無法執行
}

/*
// 執行批改(v1.0)
$javaOutput = [];
$javaReturn = -10;
exec($javaCmd, $javaOutput, $javaReturn);
*/

// 批改結果回傳
if($javaReturn === 0){
    $_SESSION['report'] .= " 已通過測資系統(" . $javaReturn . ")。";
}else if($javaReturn === -1){
    $_SESSION['error'] .= " 未通過所有測資(" . $javaReturn . ")。";
}else if($javaReturn === 4){
    $_SESSION['error'] .= " 未使用測資系統，請聯繫老師新增批改測資(" . $javaReturn . ")。";
}else if($javaReturn === 5){
    $_SESSION['error'] .= " 程式超時(" . $javaReturn . ")。";
}else if($javaReturn === 7 || $javaReturn === 17){
    $_SESSION['error'] .= " 程式無法編譯(" . $javaReturn . ")。";
}else{
    $_SESSION['error'] .= " 測資批改系統出現錯誤，請聯繫老師或管理員(" . $javaReturn . ")。";
}

// --- Java 測資批改結束 ---


// --- 執行 AI評分 (LingoBridge) ---

$LBcmd = PYTHON_PATH . ' ' . $LBpath . ' ' . $HWtextPath  . ' ' . $target;


// --- AI評分結束 ---


// --- 最終處理 ---

// 關閉資料庫連線。(在獲得 ClassID 後立即關閉，因為後面不再需要資料庫了)
$conn->close();

// 重定向使用者回上傳頁面，並終止腳本執行。
header("Location: ../uploadhomework.php");
exit();
?>