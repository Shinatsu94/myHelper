import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        if (n > 0) {
            int rightMax = a[n - 1]; // 先記住最後一個的值
            a[n - 1] = -1;           // 題目規定最後一格為 -1
            for (int i = n - 2; i >= 0; i--) {
                int curr = a[i];
                a[i] = rightMax;             // 右邊最大值
                if (curr > rightMax) rightMax = curr; // 更新右側最大
            }
        }

        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
