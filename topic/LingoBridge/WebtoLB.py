"""
PROJECT : WebtoLB
AUTHOR  : PIN CHEN, TSAI
VERSION : v1.0
UPDATE  : 2025-11-11
DETAILS : 
- 網頁資料 與 LingoBridge 間接腳本
- 使用方式如下:
```
python WebtoLB.py <quizPath> <CodePath>
```
"""

#--- INPORT--------------------------------------------------------------------+

import os
import sys

from LingoBridge import main as LB_main

#--- VARIABLE------------------------------------------------------------------+

# 如果為0，表示正常結束程序
ERROR = 0

# LLM模型選擇
MODEL = 'gpt-5-nano'

# 目前所在目錄
CURRENT_DIR = os.path.dirname(os.path.abspath(__file__))

# 預設提問句路徑
PROMPT_PATH = os.path.normpath(os.path.join(CURRENT_DIR, "data/prompt.txt"))

# 預設題目路徑
QUIZ_PATH = os.path.normpath(os.path.join(CURRENT_DIR, "data/quiz.txt"))

# 預設作業路徑
CODE_PATH = os.path.normpath(os.path.join(CURRENT_DIR, "data/code.txt"))

# 預設輸出路徑 (目前未使用)
OUTPUT_PATH = os.path.normpath(os.path.join(CURRENT_DIR, "feedback.txt"))


#--- FUNCTIONS-----------------------------------------------------------------+

# 文本檔案內容以字串回傳
def readfile(path):
    try:
        # errors = 'replace' 把無法解碼的字元換成 �(U+FFFD)。
        with open(path, 'r', encoding='utf-8', errors='replace') as file:
            return file.read()
    except Exception as e:
        print(f"【WLB】⚠️ 無法讀取檔案 {path}：{e}")

def savefile(path, msg, append=False):
    """將文字內容寫入檔案 (預設為覆寫模式)"""
    mode = 'a' if append else 'w'
    try:
        dir_name = os.path.dirname(path)
        if dir_name:
            os.makedirs(dir_name, exist_ok=True)
        with open(path, mode, encoding='utf-8') as file:
            file.write(msg.rstrip() + "\n")
        return STATUS_SUCCESS
    except Exception as e:
        print(f"[WLB] ⚠️ 無法寫入檔案 {path}：{e}")
        return ERROR_WRITING_FILE

#--- MAIN----------------------------------------------------------------------+

if __name__ == "__main__":

    # print("[WLB] 通話準備中")

    # 標準輸入
    quiz_path = sys.argv[1] if len(sys.argv) > 1 else QUIZ_PATH # 題目路徑
    code_path = sys.argv[2] if len(sys.argv) > 2 else CODE_PATH # 作業路徑

    quiz_text   = readfile(quiz_path)   # 題目文本
    code_text   = readfile(code_path)   # 作業文本
    prompt_text = readfile(PROMPT_PATH) # 提問文本

    # 完整提問句
    msg = prompt_text + "\n\n題目：\n" + quiz_text + "\n\n學生作答程式：\n" + code_text

    # 呼叫 LB系統 <Model> <Message> <userName>
    response = LB_main(MODEL, msg, 'java')

    # 判斷是否預期完成程序
    ERROR = response["status"]

    # 輸出錯誤代碼 (status)
    if ERROR != 0:
        print("[WLB]❌ 錯誤代碼: " + str(ERROR))

    print(response["reply"])
    sys.exit(ERROR)

#--- END-----------------------------------------------------------------------+
