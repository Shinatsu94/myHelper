import java.util.Scanner;
public class CSIE_41343217_1017_2 {
    public static void main(String[] args) {
        // 使用 Scanner 讀取使用者輸入
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close(); // 關閉 Scanner
        
        // 假設它是良序數
        boolean isWellOrdered = true;
        
        // 如果數字只有一位，它總是良序數，但迴圈會處理這個情況
        // 從第二個位數開始 (索引 i=1)，與前一個位數 (索引 i-1) 比較
        for (int i = 1; i < s.length(); i++) {
            // 獲取當前位數的數值
            int currentDigit = s.charAt(i) - '0';
            // 獲取前一個位數的數值
            int previousDigit = s.charAt(i - 1) - '0';
            
            // 檢查是否嚴格遞增 (currentDigit > previousDigit)
            if (currentDigit <= previousDigit) {
                // 如果不滿足嚴格遞增條件，則它不是良序數
                isWellOrdered = false;
                break; // 找到一次不滿足即可立即跳出迴圈
            }
        }
        
        // 根據判斷結果輸出對應的訊息
        if (isWellOrdered) {
            System.out.println(s + " is well-ordered number.");
        } else {
            System.out.println(s + " is not well-ordered number.");
        }
    }
}
