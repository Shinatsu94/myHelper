
//Date:2025/10/31
//Creator:41343240黃榮裕
//Funtion:將數字 1, 2, 3, .... 依照由上到下，由左到右的順序填入一個下三角形矩陣(與(a)的三角形無關)，使用者可以輸入一個特定數 num<100000 ，寫一程式找到此數字出現在此下三角形的位置，印出此數字與此位置的列編號和行編號，但不用印出三角形內容。
import java.util.Scanner;

public class CSIE_41343240_1031_3b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 高度
        if (n <= 0 || n > 20) {
            sc.close();
            return;
        }

        int num = sc.nextInt(); // 要查找的數字
        if (num <= 0 || num >= 100000) {
            sc.close();
            return;
        }

        int[][] tri = new int[n][n]; // 下三角形陣列
        int value = 1;
        int targetRow = -1, targetCol = -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                tri[i][j] = value;
                if (value == num) {
                    targetRow = i + 1; // 1-based
                    targetCol = j + 1; // 1-based
                }
                value++;
            }
        }

        if (targetRow != -1) {
            System.out.println(num + "[" + targetRow + ", " + targetCol + "]");
        } else {
            System.out.println("not find " + num + " in array.");
        }

        sc.close();
    }
}
