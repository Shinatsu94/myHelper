import java.util.Scanner;

public class CSIE_41343211_1031_3_a_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 讀取高度 n
        int n = input.nextInt();

        // 驗證 n 範圍
        if (n <= 0 || n > 20) {
            System.out.println("輸入錯誤，n 必須在 1 到 20 之間");
            input.close();
            return;
        }

        // 建立下三角形二維陣列
        char[][] triangle = new char[n][];
        for (int i = 0; i < n; i++) {
            triangle[i] = new char[i + 1];
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = '*';
            }
        }

        // 列印下三角形
        for (int i = 0; i < n; i++) {
            System.out.println(triangle[i]);
        }

        input.close();
    }
}
