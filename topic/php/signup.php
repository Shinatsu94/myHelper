<?php
// 開啟 session
session_start();

// 資料庫連線
$conn = new mysqli("localhost", "root", "", "topic");
if ($conn->connect_error) {
    die("連線失敗: " . $conn->connect_error);
}

// 接收表單資料
$firstname  = $_POST['firstname'];
$lastname   = $_POST['lastname'];
$email      = $_POST['email'];
$password   = $_POST['password'];
$repassword = $_POST['repassword'];
$job        = $_POST['job'];

// 驗證密碼一致
if ($password !== $repassword) {
    $_SESSION['error'] = "密碼不一致，請重新確認！";
    header("Location: ../signup.php");
    exit();
}

// 避免 SQL 注入
$firstname  = $conn->real_escape_string($firstname);
$lastname   = $conn->real_escape_string($lastname);
$email      = $conn->real_escape_string($email);
$password   = $conn->real_escape_string($password);
$job        = $conn->real_escape_string($job);

// 檢查 Email 是否已註冊
$sql_check_email = "SELECT * FROM users WHERE Email = '$email'";
$result = $conn->query($sql_check_email);

if ($result->num_rows > 0) {
    $_SESSION['error'] = "這個 Email 已經註冊過，請使用其他 Email！";
    header("Location: ../signup.php");
    exit();
}

// 找最新的 UserID (數字型)
$sql_get_latest_userID = "SELECT UserID FROM users ORDER BY UserID DESC LIMIT 1";
$result = $conn->query($sql_get_latest_userID);

if ($result->num_rows > 0) {
    $row = $result->fetch_assoc();
    $latest_userID = (int)$row['UserID'];
    $new_userID = $latest_userID + 1;
} else {
    $new_userID = 1; // 如果沒有資料，從 1 開始
}

// 插入新使用者
$sql_insert = "INSERT INTO `users` (`UserID`, `Email`, `Password`, `FirstName`, `LastName`, `Job`) 
               VALUES ($new_userID, '$email', '$password', '$firstname', '$lastname', '$job')";

if ($conn->query($sql_insert) === TRUE) {
    // 前端顯示時才補零
    $displayID = str_pad($new_userID, 7, '0', STR_PAD_LEFT);
    $_SESSION['error'] = "註冊成功！";
    header("Location: ../login.php");
    exit();
} else {
    $_SESSION['error'] = "註冊失敗: " . $conn->error;
    header("Location: ../signup.php");
}

$conn->close();
?>
