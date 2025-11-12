import java.util.Scanner;

public class ReplaceWithRightMax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // 陣列長度
        int[] arr = new int[n];

        // 讀入陣列
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        // 依題意：每個位置替換為其右邊最大值，最後一個為 -1
        int maxFromRight = -1;
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = maxFromRight;
            if (temp > maxFromRight) {
                maxFromRight = temp;
            }
        }

        // 輸出結果
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) System.out.print(" ");
        }
    }
}
