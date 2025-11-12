import java.util.Scanner;

public class CSIE_41343211_1031_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 讀取陣列長度
        int n = input.nextInt();
        if (n <= 0) {
            System.out.println("陣列長度必須大於 0");
            input.close();
            return;
        }

        int[] arr = new int[n];

        // 讀取陣列元素
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        // 從右往左遍歷，替換為右邊最大值
        int maxSoFar = -1;
        for (int i = n - 1; i >= 0; i--) {
            int current = arr[i];
            arr[i] = maxSoFar;
            if (current > maxSoFar) {
                maxSoFar = current;
            }
        }

        // 輸出結果
        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(arr[i]);
        }
        System.out.println();

        input.close();
    }
}
