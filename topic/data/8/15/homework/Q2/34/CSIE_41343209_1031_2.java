import java.util.Scanner;

public class CSIE_41343209_1031_2{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        // 讀取陣列元素
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 替換每個元素為它之後的最大值
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                arr[i] = -1; // 最後一個元素直接替換為 -1
            } else {
                int max = arr[i + 1];
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] > max) {
                        max = arr[j];
                    }
                }
                arr[i] = max;
            }
        }

        // 輸出結果
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i != n - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
