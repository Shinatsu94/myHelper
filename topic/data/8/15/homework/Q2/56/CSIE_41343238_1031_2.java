import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();          // 讀入陣列長度
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {  // 讀入 n 個整數（可含負數）
            a[i] = sc.nextInt();
        }

        // 右側最大值置換：由右往左掃描，維護目前右側最大值
        int maxRight = -1;
        for (int i = n - 1; i >= 0; i--) {
            int cur = a[i];
            a[i] = maxRight;           // 位置 i 改成右側最大值
            if (cur > maxRight) {
                maxRight = cur;        // 更新右側最大值
            }
        }

        // 輸出（同一行、以空白分隔、無多餘字樣）
        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
    }
}
