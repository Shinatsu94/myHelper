import java.util.Scanner;

/*
 * 檔案名稱請設為 Main.java，並使用 public class Main
 */
public class CSIE_41343236_1031_2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // 1. 讀取陣列的長度
        int n = scanner.nextInt();

        // 2. 建立陣列
        // 只需要一個陣列，我們可以直接在原陣列上修改
        int[] arr = new int[n];

        // 3. 讀取使用者依序輸入的 n 個整數
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // 4. 核心邏輯：從右往左遍歷 (O(n) 最佳解法)
        
        // 必須檢查 n > 0，否則 n=0 時 arr[n-1] 會報錯
        if (n > 0) {
            
            // (a) 建立變數，追蹤「從右邊看過來，目前的最大值」
            //     初始值設為原始陣列的 "最後一個" 元素
            int maxFromRight = arr[n - 1];

            // (b) 根據題目要求，最後一個元素固定為 -1
            arr[n - 1] = -1;

            // (c) 從 "倒數第二個" 元素 (i = n - 2) 開始，一路往左 (i = 0) 處理
            for (int i = n - 2; i >= 0; i--) {
                
                // (1) 暫存目前元素的值 (因為它即將被覆蓋)
                int temp = arr[i];
                
                // (2) 將目前元素 arr[i] 替換為「我們目前追蹤到的右側最大值」
                arr[i] = maxFromRight;

                // (3) 更新「右側最大值」
                //     比較 (剛才暫存的 temp) 和 (已知的 maxFromRight)
                if (temp > maxFromRight) {
                    maxFromRight = temp;
                }
                
                // (簡潔寫法)
                // maxFromRight = Math.max(maxFromRight, temp);
            }
        }

        // 5. 印出 "置換後" 的陣列內容
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            
            // 確保最後一個數字後面沒有空白
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        System.out.println(); // 最後換行

        // 6. 關閉 scanner
        scanner.close();
    }
}