<?php
declare(strict_types=1);
session_start();

/* ---------- 基本檢查 ---------- */
if (!isset($_SESSION['selected_homework_id'], $_SESSION['selected_class_id'], $_SESSION['UserID'])) {
    header("Location: ../index.php");
    exit;
}
$homeworkID = $_SESSION['selected_homework_id'];
$classID    = $_SESSION['selected_class_id'];
$userid     = $_SESSION['UserID'];

/* ---------- 資料庫連線（只開一次） ---------- */
$conn = new mysqli("localhost", "root", "", "topic");
if ($conn->connect_error) {
    header("Location: ../index.php");
    die("連線失敗: " . $conn->connect_error);
}

/* ---------- 基本資訊 ---------- */
// 作業名稱
$homeworkName = '';
$res = $conn->query("SELECT HomeworkName FROM homeworkslist WHERE HomeworkID = '$homeworkID'");
if ($res && $res->num_rows === 1) {
    $homeworkName = (string)$res->fetch_assoc()['HomeworkName'];
} else {
    $conn->close();
    header("Location: ../index.php");
    exit;
}

// 登入者姓名
$fullname = '';
$resUser = $conn->query("SELECT FirstName, LastName FROM users WHERE UserID = '$userid'");
if ($resUser && $resUser->num_rows === 1) {
    $rowU = $resUser->fetch_assoc();
    $fullname = $rowU['FirstName'] . $rowU['LastName'];
} else {
    $conn->close();
    header("Location: ../index.php");
    exit;
}

// 作業資料
$hwData = null;
$resHw = $conn->query("SELECT * FROM homeworkslist WHERE HomeworkID = '$homeworkID'");
if ($resHw && $resHw->num_rows > 0) {
    $hwData = $resHw->fetch_assoc();
} else {
    $conn->close();
    die("<p style='color:red;'>查無此作業</p>");
}

// 班級學生清單
$studentIDs = [];
$resStu = $conn->query("SELECT StudentID FROM student WHERE ClassID = '$classID'");
if ($resStu && $resStu->num_rows > 0) {
    while ($r = $resStu->fetch_assoc()) $studentIDs[] = $r['StudentID'];
} else {
    $conn->close();
    die("<p style='color:red;'>沒有成員</p>");
}

/* ---------- 檔案根目錄（依實際路徑二選一） ---------- */
// 若你的檔案在 topicbee/data：
# $dataRoot = __DIR__ . '/../topicbee/data/' . $classID . '/' . $homeworkID;
// 若你的檔案在 topic/data：
$dataRoot = __DIR__ . '/../topic/data/' . $classID . '/' . $homeworkID;

/* ---------- 最新模型回傳（Session → result.json） ---------- */
$latestScore = $_SESSION['lb_score']     ?? null;
$latestMax   = $_SESSION['lb_score_max'] ?? null;
$latestFB    = $_SESSION['lb_feedback']  ?? null;

if ($latestFB === null) {
    $resultPath = dirname(__DIR__) . "/data/$classID/$homeworkID/result.json";
    if (is_file($resultPath)) {
        $resJson = json_decode((string)file_get_contents($resultPath), true);
        if (is_array($resJson)) {
            $latestFB   = $resJson['feedback']  ?? null;
            $latestScore= $resJson['score']     ?? null;
            $latestMax  = $resJson['score_max'] ?? null;
        }
    }
}
// 回饋 fallback JSON（右欄逐題用）
// $fallbackJson = dirname(__DIR__) . "/data/$classID/$homeworkID/result.json";
// $fallbackObj  = is_file($fallbackJson) ? json_decode((string)file_get_contents($fallbackJson), true) : null;

?><!DOCTYPE html>
<html lang="zh-Hant">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge"> 
    <title><?php echo htmlspecialchars($homeworkName, ENT_QUOTES, 'UTF-8'); ?></title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- 外掛/樣式 -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
    <link href="https://fonts.googleapis.com/css?family=Work+Sans:300,400,500,700,800" rel="stylesheet">
    <link rel="stylesheet" href="css/animate.css"><link rel="stylesheet" href="css/icomoon.css">
    <link rel="stylesheet" href="css/bootstrap.css"><link rel="stylesheet" href="css/magnific-popup.css">
    <link rel="stylesheet" href="css/owl.carousel.min.css"><link rel="stylesheet" href="css/owl.theme.default.min.css">
    <link rel="stylesheet" href="css/style.css">
    <script src="js/modernizr-2.6.2.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>

    <style>
        .feedback-box{line-height:1.3;font-size:14px;margin-top:5px}
        .feedback-sidebar{max-height:600px;overflow-y:auto;border-right:1px solid #ccc;padding-right:10px}
        .feedback-sidebar ul{list-style-type:none;padding:0}
        .feedback-sidebar li{padding:6px 10px;cursor:pointer}
        .feedback-sidebar li:hover{background:#f0f0f0}
        input[type=number]::-webkit-inner-spin-button,input[type=number]::-webkit-outer-spin-button{-webkit-appearance:none;margin:0}
        input[type=number]{-moz-appearance:textfield}
    </style>
</head>
<body>
<div class="fh5co-loader"></div>

<div id="page">
    <nav class="fh5co-nav" role="navigation">
        <div class="top">
            <div class="container">
                <div class="row">
                    <div class="col-xs-12 text-right">
                        <p class="num"><?php echo htmlspecialchars($fullname, ENT_QUOTES, 'UTF-8'); ?></p>
                        <ul class="fh5co-social">
                            <li><a href="index.php">登出</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <div class="top-menu">
            <div class="container">
                <div class="row">
                    <div class="col-xs-1">
                        <a href="teacher.php"><img src="./images/NFU_Logo.png" alt="LOGO" style="height:50px"></a>
                    </div>
                    <div class="col-xs-11 text-right menu-1">
                        <ul>
                            <li class="btn-cta"><a href="homeworkscores.php"><span>模型分數分析</span></a></li>
                            <li class="btn-cta"><a href="teacherclass.php"><span>返回</span></a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </nav>

    <header id="fh5co-header" class="fh5co-bgm" role="banner" style="background-image:url(images/img_bg_2.jpg);" data-stellar-background-ratio="0.5"></header>

    <div class="container">
        <div class="row">
            <!-- 左側學生清單 -->
            <div class="col-md-2 feedback-sidebar">
                <button class="btn btn-success mt-3" onclick="submitAllScores()">儲存分數</button>
                <ul>
                <?php
                echo "<h4><br>學生分數</h4>";
                foreach ($studentIDs as $studentID) {
                    // 姓名
                    $stuName = '';
                    $r3 = $conn->query("SELECT FirstName, LastName FROM users WHERE UserID = '$studentID'");
                    if ($r3 && $t = $r3->fetch_assoc()) $stuName = $t['FirstName'] . $t['LastName'];

                    // final 分數 or 平均分
                    $placeholder = "";
					$rFinal = $conn->query("SELECT Score FROM final WHERE HomeworkID = '$homeworkID' AND StudentID = '$studentID'");
					if ($rFinal && $rFinal->num_rows > 0) {
						$rowFinal   = $rFinal->fetch_assoc();
						$placeholder = isset($rowFinal['Score']) ? (string)$rowFinal['Score'] : "";
					} else {
						$rAvg = $conn->query("SELECT AVG(score) AS avg_score FROM results WHERE HomeworkID = '$homeworkID' AND StudentID = '$studentID'");
						$rowAvg = $rAvg ? $rAvg->fetch_assoc() : null;
						$placeholder = ($rowAvg && $rowAvg['avg_score'] !== null) ? (string)intval($rowAvg['avg_score']) : "";
					}

                    echo "<li onclick=\"selectStudent('{$studentID}', this)\">" . htmlspecialchars($stuName, ENT_QUOTES, 'UTF-8') . "
                        <input type='number' min='0' max='100' step='1'
                            class='form-control form-control-sm mt-1'
                            style='width:90px;font-size:20px'
                            placeholder='". htmlspecialchars($placeholder, ENT_QUOTES, 'UTF-8') ."'
                            onclick='event.stopPropagation();'
                            onchange=\"saveScore('{$studentID}', this.value)\">
                    </li>";
                }
                ?>
                </ul>
            </div>

            <!-- 中間 題號 + 模型 -->
            <div class="col-md-3 feedback-sidebar">
                <ul>
                <?php
                foreach ($studentIDs as $sid) {
                    echo "<div id='content_{$sid}' class='question-list' style='display:none'>";
                    echo "<h4><br>題號與模型</h4>";

                    for ($i = 1; $i <= (int)$hwData['QuestionSum']; $i++) {
                        echo "<li onclick=\"showCode(currentStudentID, 'Q{$i}', this)\">第 {$i} 題 - 作業</li>";
                        foreach (["Gemini","Mistral", "GPT-oss", "gpt-5-nano"] as $model) {
                            $modelCode = ($model === "Gemini") ? 0 : 1;
                            $rScore = $conn->query("SELECT score FROM results WHERE HomeworkID = '$homeworkID' AND StudentID = '$sid' AND Question = '$i' AND LLM = '$modelCode'");
                            $scoreDisplay = ""; // 尚未評分
                            if ($rScore && $rScore->num_rows > 0) {
                                $currentScore = (int)$rScore->fetch_assoc()['score'];
                                $scoreDisplay = "($currentScore)";
                            }
                            echo "<li onclick=\"showFeedback(currentStudentID, 'Q{$i}', '{$model}', this)\">第 {$i} 題 - {$model}回饋{$scoreDisplay}</li>";
                        }
                    }

                    // 模型平均分
                    $rAvgAll = $conn->query("SELECT AVG(score) AS avg_score FROM results WHERE HomeworkID = '$homeworkID' AND StudentID = '$sid'");
					$avgscoreall = 0;
					if ($rAvgAll) {
						$rowAvgAll = $rAvgAll->fetch_assoc();
						if ($rowAvgAll && $rowAvgAll['avg_score'] !== null) {
							$avgscoreall = (int)round($rowAvgAll['avg_score']);
						}
					}

                    // echo "<h4><br>模型平均分：{$avgscoreall}</h4>";

                    echo "</div>";
                }
                ?>
                </ul>
            </div>

            <!-- 右側 Feedback 顯示 -->
            <div class="col-md-7">
                <?php
                // 右欄頂部：顯示「最新一次」模型回傳
                if ($latestFB !== null) {
                    echo '<div class="feedback-box" style="border:1px solid #ddd;border-radius:6px;padding:12px;margin:16px 0;background:#fff">';
                    echo '<h4 style="margin-top:0">最新模型回傳</h4>';
                    if ($latestScore !== null && $latestMax !== null) {
                        echo '<p><strong>分數：</strong>' . htmlspecialchars($latestScore . '/' . $latestMax, ENT_QUOTES, 'UTF-8') . '</p>';
                    } else {
                        echo '<p><strong>分數：</strong>—</p>';
                    }
                    echo '<div style="white-space:pre-wrap;font-family:ui-monospace,SFMono-Regular,Menlo,Consolas,monospace">';
                    echo htmlspecialchars($latestFB, ENT_QUOTES, 'UTF-8');
                    echo '</div></div>';
                    unset($_SESSION['lb_feedback'], $_SESSION['lb_score'], $_SESSION['lb_score_max']);
                }

                // 顯示作業題目與學生程式碼
                foreach ($studentIDs as $sid) {
                    $stuName = '';
                    $rName = $conn->query("SELECT FirstName, LastName FROM users WHERE UserID = '$sid'");
                    if ($rName && $rowN = $rName->fetch_assoc()) $stuName = $rowN['FirstName'] . $rowN['LastName'];

                    for ($i = 1; $i <= (int)$hwData['QuestionSum']; $i++) {
                        $codePath     = $dataRoot . "/homework/Q{$i}/$sid/"; // 學生程式碼目錄
                        $questionPath = $dataRoot . "/homework_texts/Q{$i}.txt"; // 題目檔案
                        $questionText = file_exists($questionPath) ? file_get_contents($questionPath) : "無題目內容";

                        echo "<div id='code_{$sid}_Q{$i}' class='feedback-box' style='display:none'>";
                        echo "<br><h2>" . htmlspecialchars($stuName, ENT_QUOTES, 'UTF-8') . " 的 第 {$i} 題 作業與題目</h2>";
                        echo "<strong>題目：</strong><pre style='white-space: pre-wrap;'>" . htmlspecialchars($questionText) . "</pre>";

                        $files = glob($codePath . "*.*");
                        if ($files && file_exists($files[0])) {
                            $code = file_get_contents($files[0]);
                            echo "<strong>程式碼：</strong><pre style='background-color:#f9f9f9;padding:10px;'>" . htmlspecialchars($code) . "</pre>";
                        } else {
                            echo "<p>尚未繳交作業</p>";
                        }
                        echo "</div>";
                    }
                }

                // 讀取輸出結果（Session 或 POST）
                $gemini_output = $_POST['gemini_output'] ?? ($_SESSION['gemini_output'] ?? null);
                $mistral_output = $_POST['mistral_output'] ?? ($_SESSION['mistral_output'] ?? null);

                // 以模型名稱建立對應表，迴圈時用 $model 索引就能拿到對應輸出
                $modelOutput = [
                    'Gemini'  => $gemini_output,
                    'Mistral' => $mistral_output,
                ];

                // 顯示每題每模型的回饋（檔案優先；找不到用 result.json fallback）
                foreach ($studentIDs as $sid) {
                    $stuName = '';
                    $rName = $conn->query("SELECT FirstName, LastName FROM users WHERE UserID = '$sid'");
                    if ($rName && $rowN = $rName->fetch_assoc()) {
                        $stuName = $rowN['FirstName'] . $rowN['LastName'];
                    }

                    for ($i = 1; $i <= (int)$hwData['QuestionSum']; $i++) {
                        foreach (["Gemini","Mistral", "GPT-oss", "gpt-5-nano"] as $model) {
                            $fid = "Q{$i}_{$model}";
                            //$dir = $dataRoot . "/homework/$sid/Q{$i}/feedback";
                            $dir = $dataRoot . "/feedback/Q{$i}/$sid";
                            $matches = glob($dir . "/*{$model}*.txt", GLOB_NOSORT);
                            $feedbackFile = $matches[0] ?? null;
                            echo "<div id='content_{$sid}_{$fid}' class='feedback-box' style='display:none'>";
                            echo "<h3><br>回饋與評分</h3>";
                            echo "<h4>" . htmlspecialchars($stuName, ENT_QUOTES, 'UTF-8') . " 的 第 {$i} 題 - {$model} 回饋</h4>";

                            if ($feedbackFile && is_file($feedbackFile)) {
                                // 有檔案 → 顯示回饋
                                $content = file_get_contents($feedbackFile);
                                $pos = strpos($content, "1.");
                                $feedback = ($pos !== false) ? substr($content, $pos + 2) : $content;
                                echo '<pre style="white-space: pre-wrap;">' . htmlspecialchars($feedback, ENT_QUOTES, 'UTF-8') . '</pre>';

                            } elseif ($model === "Mistral") {
                                // 沒找到 Mistral 檔案 → 顯示未執行AI評分，並結束這一輪
                                echo "<p>未執行AI評分</p>";
                                echo "</div>";
                                continue;

                            } elseif (is_file($fjson = $dataRoot . "/homework/$sid/Q{$i}/result.json")) {
                                // fallback：result.json
                                $fobj = json_decode((string)file_get_contents($fjson), true) ?: [];
                                $fb = $fobj['feedback']  ?? null;
                                $sc = $fobj['score']     ?? null;
                                $mx = $fobj['score_max'] ?? null;

                                if ($fb !== null || $sc !== null) {
                                    if ($sc !== null && $mx !== null) {
                                        echo '<p><strong>分數 (fallback)：</strong>' . htmlspecialchars($sc . '/' . $mx, ENT_QUOTES, 'UTF-8') . '</p>';
                                    }
                                    echo '<pre style="white-space: pre-wrap;">' . htmlspecialchars((string)$fb, ENT_QUOTES, 'UTF-8') . '</pre>';
                                } else {
                                    // 有 result.json 但沒有任何回饋 → 顯示訊息並結束這一輪
                                    echo "<p>未執行AI評分</p>";
                                    echo "</div>";
                                    continue;
                                }

                            } else {
                                // 完全沒有檔案 → 顯示訊息並結束這一輪
                                echo "<p>未執行AI評分</p>";
                                echo "</div>";
                                continue;
                            }

                            // 額外顯示由 selecthomework6.php 傳入的內容（若有），依模型對應顯示
                            if (!empty($modelOutput[$model])) {
                                echo '<strong>AI 回應：</strong>';
                                echo '<pre style="white-space: pre-wrap; background:#eef; padding:10px;">'
                                    . htmlspecialchars($modelOutput[$model], ENT_QUOTES, 'UTF-8') . '</pre>';
                            }

                            echo "</div>";
                        }
                    }
                }

                // 可選：只用一次後就清掉 Session 的值，避免下次還留著
                unset($_SESSION['gemini_output']);
                ?>
            </div>
        </div>
    </div>

    <div class="col-md-12 text-center">
        <p>
            <small class="block">by 翁慧霖 </small> 
            <small class="block">張宇光</small> 
            <br>
            <small class="block">國立虎尾科技大學 資工系</small> 
        </p>
    </div>

    <div class="gototop js-top">
        <a href="#" class="js-gotop"><i class="icon-arrow-up"></i></a>
    </div>
</div>

<!-- JS -->
<script>
let currentStudentID = "";

function selectStudent(studentID, element) {
    currentStudentID = studentID;

    document.querySelectorAll('.feedback-sidebar:nth-child(1) li').forEach(li => li.classList.remove('active'));
    element.classList.add('active');

    document.querySelectorAll('.question-list').forEach(list => list.style.display = 'none');
    const ql = document.getElementById(`content_${studentID}`);
    if (ql) ql.style.display = 'block';

    document.querySelectorAll('.feedback-box').forEach(box => box.style.display = 'none');
    document.querySelectorAll('.feedback-sidebar:nth-child(2) li').forEach(li => li.classList.remove('active'));
}

function showFeedback(studentID, question, model, element) {
    if (!studentID) { alert("請先選擇一位學生！"); return; }
    document.querySelectorAll('.feedback-sidebar:nth-child(2) li').forEach(li => li.classList.remove('active'));
    element.classList.add('active');

    document.querySelectorAll('.feedback-box').forEach(box => box.style.display = 'none');

    const box = document.getElementById(`content_${studentID}_${question}_${model}`);
    if (box) box.style.display = 'block';
}

function showCode(studentID, question, element) {
    if (!studentID) { alert("請先選擇一位學生！"); return; }
    document.querySelectorAll('.feedback-sidebar:nth-child(2) li').forEach(li => li.classList.remove('active'));
    element.classList.add('active');

    document.querySelectorAll('.feedback-box').forEach(box => box.style.display = 'none');

    const box = document.getElementById(`code_${studentID}_${question}`);
    if (box) box.style.display = 'block';
}

// 單一學生即時儲存
function saveScore(studentID, score) {
    if (!studentID || score === "") return;
    const fd = new FormData();
    fd.append("student_id", studentID);
    fd.append("score", score);
    fetch("save_score.php", { method: "POST", body: fd })
        .then(r => r.text()).then(msg => console.log(msg))
        .catch(err => console.error(err));
}

// 批次儲存
function submitAllScores() {
    const inputs = document.querySelectorAll(".feedback-sidebar input[type='number']");
    let formData = new FormData();
    let hasData = false;

    inputs.forEach(input => {
        const m = input.closest('li').getAttribute('onclick').match(/'(.*?)'/);
        if (!m) return;
        const studentID = m[1];
        let score = input.value.trim();
        if (score === "") score = input.placeholder;
        if (score !== "") {
            formData.append("scores[" + studentID + "]", score);
            hasData = true;
        }
    });

    if (!hasData) { alert("沒有可儲存的分數！"); return; }
    fetch("save_all_scores.php", { method: "POST", body: formData })
        .then(res => res.text())
        .then(msg => { alert(msg); })
        .catch(err => { console.error(err); alert("儲存失敗，請稍後再試！"); });
}
</script>

<!-- 其他外掛 -->
<script src="js/jquery.min.js"></script>
<script src="js/jquery.easing.1.3.js"></script>
<script src="js/jquery.waypoints.min.js"></script>
<script src="js/jquery.stellar.min.js"></script>
<script src="js/owl.carousel.min.js"></script>
<script src="js/jquery.countTo.js"></script>
<script src="js/jquery.magnific-popup.min.js"></script>
<script src="js/magnific-popup-options.js"></script>
<script src="js/main.js"></script>
</body>
</html>
