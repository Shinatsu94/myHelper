import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();         // 讀入陣列長度
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) { // 讀入陣列內容
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);             // 進行升冪排序

        for (int i = 0; i < n; i++) { // 輸出結果
            System.out.print(arr[i]);
            if (i != n - 1) System.out.print(" ");
        }
        System.out.println();
    }
}
