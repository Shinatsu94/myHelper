import java.util.Scanner;

public class CSIE_41343217_1017_3 {
    public static void main(String[] args) {
        // 建立 Scanner 物件來讀取使用者輸入
        Scanner scanner = new Scanner(System.in);
        
        // 讀取一個整數
        int n = scanner.nextInt();
        
        // 關閉 Scanner
        scanner.close();

        // 呼叫反轉數字的方法
        int reversed_n = reverseDigits(n);
        
        // 輸出結果
        System.out.println(reversed_n);
    }
    
    /**
     * 反轉整數的數字順序。
     * @param n 要反轉的整數
     * @return 反轉後的整數 (會自動處理前導零)
     */
    public static int reverseDigits(int n) {
        int reversed_n = 0;
        
        // 處理 0 的情況
        if (n == 0) {
            return 0;
        }

        // 反轉數字
        while (n != 0) {
            int digit = n % 10;
            // 檢查反轉後的數字是否會超出 int 範圍 (雖然題目範例不會，但在實際應用中是必要的)
            // 這裡假設輸入符合 int 範圍且反轉後不會溢位
            reversed_n = reversed_n * 10 + digit;
            n /= 10;
        }
        
        return reversed_n;
    }
}