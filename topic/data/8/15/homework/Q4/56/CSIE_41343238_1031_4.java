import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // 陣列高度
        int num = sc.nextInt(); // 要尋找的數字 (num < 100000)

        int[][] tri = new int[n][];
        int val = 1;
        int foundRow = -1, foundCol = -1; // 1-based

        // 建立並填入下三角形（第 i 列長度 i+1），同時記錄 num 位置
        for (int i = 0; i < n; i++) {
            tri[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                tri[i][j] = val;
                if (val == num) {
                    foundRow = i + 1; // 1-based
                    foundCol = j + 1; // 1-based
                }
                val++;
            }
        }

        if (foundRow != -1) {
            System.out.println(num + "[" + foundRow + ", " + foundCol + "]");
        } else {
            System.out.println("not find " + num + " in array.");
        }
    }
}
