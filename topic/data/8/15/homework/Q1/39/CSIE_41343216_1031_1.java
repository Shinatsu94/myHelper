import java.util.Scanner;     // 匯入 Scanner 讓我們可以讀取輸入
import java.util.Arrays;      // 匯入 Arrays 類別，用來排序

public class CSIE_41343216_1031_1 {   // 檔名與類別名稱必須相同
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // 建立 Scanner 物件

        int n = input.nextInt();    // 讀取陣列長度
        int[] arr = new int[n];     // 宣告陣列大小為 n

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();   // 逐一讀入每個整數
        }

        Arrays.sort(arr);   // 使用內建排序（由小到大）

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);     // 印出數字
            if (i < n - 1) System.out.print(" ");  // 元素之間用空白隔開
        }

        input.close();  // 關閉 Scanner
    }
}
