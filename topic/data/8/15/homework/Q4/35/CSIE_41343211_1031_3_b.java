import java.util.Scanner;

public class CSIE_41343211_1031_3_b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 讀取高度 n
        
        int n = input.nextInt();

        if (n <= 0 || n > 1000) { // 可調整限制
            System.out.println("輸入錯誤，n 必須大於 0。");
            return;
        }

        // 讀取要尋找的數字 num
        
        int num = input.nextInt();

        if (num <= 0 || num >= 100000) {
            System.out.println("輸入錯誤，num 必須介於 1 到 99999 之間。");
            return;
        }

        // 計算三角形中總元素數量
        int total = n * (n + 1) / 2;

        // 若 num 超出範圍
        if (num > total) {
            System.out.println("not find " + num + " in array.");
            return;
        }

        // 建立下三角形陣列並填入數字
        int[][] triangle = new int[n][];
        int value = 1;

        for (int i = 0; i < n; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = value;
                value++;
            }
        }

        // 尋找 num 的位置
        boolean found = false;
        int row = -1, col = -1;

        outer:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (triangle[i][j] == num) {
                    row = i + 1; // 列編號從 1 開始
                    col = j + 1; // 行編號從 1 開始
                    found = true;
                    break outer;
                }
            }
        }

        // 輸出結果
        if (found) {
            System.out.println(num + "[" + row + ", " + col + "]");
        } else {
            System.out.println("not find " + num + " in array.");
        }

        input.close();
    }
}
