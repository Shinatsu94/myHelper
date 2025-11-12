import java.util.Scanner;

public class TriangleArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();  // 陣列高度
        int num = s.nextInt(); // 要尋找的數字

        // 計算陣列總元素數量 = 1 + 2 + ... + n = n*(n+1)/2
        int total = n * (n + 1) / 2;

        if (num > total || num <= 0) {
            System.out.println("not find " + num + " in array.");
            return;
        }

        // 填入下三角形並尋找 num 的位置
        int[][] arr = new int[n][];
        int value = 1;
        int row = -1, col = -1;

        for (int i = 0; i < n; i++) {
            arr[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                arr[i][j] = value;
                if (value == num) {
                    row = i + 1; // 列從 1 開始
                    col = j + 1; // 行從 1 開始
                }
                value++;
            }
        }

        if (row != -1 && col != -1) {
            System.out.println(num + "[" + row + ", " + col + "]");
        } else {
            System.out.println("not find " + num + " in array.");
        }

        s.close();
    }
}
