import java.util.Scanner; // 用於讀取使用者輸入
import java.util.Arrays;  // 用於呼叫內建的排序功能

public class CSIE_41343236_1031_1 {
    public static void main(String[] args) {
        // 1. 建立 Scanner 物件以讀取輸入
        Scanner scanner = new Scanner(System.in);

        // 2. 讀取使用者輸入的陣列長度
        int n = scanner.nextInt();

        // 3. 建立一個長度為 n 的整數陣列
        int[] arr = new int[n];

        // 4. 使用 for 迴圈，依序讀取 n 個整數到陣列中
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // 5. 核心步驟：
        //    使用 java.util.Arrays 類別中的 sort 方法
        //    它會自動對整個陣列進行升冪排序
        Arrays.sort(arr);

        // 6. 印出排序後的結果
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);

            // 為了符合輸出的格式，只在非最後一個數字的後面加上空白
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        
        // 7. 最後換行
        System.out.println();

        // 8. 關閉 scanner 是一個好習慣
        scanner.close();
    }
}