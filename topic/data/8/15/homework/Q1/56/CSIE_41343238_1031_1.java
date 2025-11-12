import java.util.Scanner;

public class Main {
    static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIdx]) minIdx = j;
            }
            if (minIdx != i) {
                int t = a[i]; a[i] = a[minIdx]; a[minIdx] = t;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();          // 讀入陣列長度
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {  // 讀入 n 個整數（可含負數）
            arr[i] = sc.nextInt();
        }

        selectionSort(arr);            // 升冪排序

        // 輸出（同一行、以空白分隔、無多餘提示）
        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(arr[i]);
        }
    }
}
