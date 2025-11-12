import java.util.Scanner;

public class CSIE_41343240_1031_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        // 讀入陣列元素
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 替換成右側最大值
        int maxRight = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            int current = arr[i];
            arr[i] = (i == n - 1) ? -1 : maxRight; // 最後一個位置為 -1
            if (current > maxRight) {
                maxRight = current;
            }
        }

        // 輸出結果
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1)
                System.out.print(" ");
        }
        System.out.println();

        sc.close();
    }
}
