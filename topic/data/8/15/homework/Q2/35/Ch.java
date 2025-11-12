import java.util.Scanner;
import java.util.Arrays;

public class Ch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 讀入陣列長度
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // 讀入陣列元素
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // 升冪排序
        Arrays.sort(arr);

        // 置換每個元素為之後的最大值（最後一個元素設為 -1）
        for (int i = 0; i < n - 1; i++) {
            int max = arr[i + 1];
            for (int j = i + 2; j < n; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            arr[i] = max;
        }
        arr[n - 1] = -1;

        // 輸出結果
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }

        scanner.close();
    }
}
