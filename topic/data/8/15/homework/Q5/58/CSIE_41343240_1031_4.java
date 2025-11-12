
//Date:2025/10/31
//Creator:41343240黃榮裕
//Funtion:寫一程式可以讀入使用者輸入的任意 3x3 矩陣，並且輸出此它的反矩陣，其中反矩陣的計算方式如附件說明
import java.util.Scanner;

public class CSIE_41343240_1031_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] m = new double[3][3];

        // 讀入 3x3 矩陣
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                m[i][j] = sc.nextDouble();

        // 計算行列式
        double det = m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
                - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
                + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);

        if (det == 0) {
            System.out.println("矩陣不可逆");
            sc.close();
            return;
        }

        // 計算逆矩陣
        double[][] inv = new double[3][3];
        inv[0][0] = (m[1][1] * m[2][2] - m[1][2] * m[2][1]) / det;
        inv[0][1] = -(m[0][1] * m[2][2] - m[0][2] * m[2][1]) / det;
        inv[0][2] = (m[0][1] * m[1][2] - m[0][2] * m[1][1]) / det;

        inv[1][0] = -(m[1][0] * m[2][2] - m[1][2] * m[2][0]) / det;
        inv[1][1] = (m[0][0] * m[2][2] - m[0][2] * m[2][0]) / det;
        inv[1][2] = -(m[0][0] * m[1][2] - m[0][2] * m[1][0]) / det;

        inv[2][0] = (m[1][0] * m[2][1] - m[1][1] * m[2][0]) / det;
        inv[2][1] = -(m[0][0] * m[2][1] - m[0][1] * m[2][0]) / det;
        inv[2][2] = (m[0][0] * m[1][1] - m[0][1] * m[1][0]) / det;

        // 輸出逆矩陣（小數點四位，但 0.0000 輸出成 0）
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                double val = Math.abs(inv[i][j]) < 1e-10 ? 0.0 : inv[i][j];
                if (val == 0.0) {
                    System.out.print("0");
                } else {
                    System.out.printf("%.4f", val);
                }
                if (j < 2)
                    System.out.print(" ");
            }
            if (i < 2)
                System.out.println();
        }

        sc.close();
    }
}
