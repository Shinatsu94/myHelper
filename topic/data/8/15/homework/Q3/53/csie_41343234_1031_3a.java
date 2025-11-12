import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 輸入高度

        char[][] arr = new char[n][n];

        // 建立下三角形陣列
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                arr[i][j] = '*';
            }
        }

        // 輸出結果（元素間無空白）
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
