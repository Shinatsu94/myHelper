import java.util.Scanner;
import java.text.DecimalFormat;

public class CSIE_51015105_1031_5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] A = new double[3][3];

        // 讀入 3x3 矩陣
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = sc.nextDouble();
            }
        }

        sc.close();

        double det = determinant(A);

        if (det == 0) {
            System.out.println("矩陣不可逆");
            return;
        }

        double[][] inv = inverse(A, det);

        // 格式化輸出
        DecimalFormat df = new DecimalFormat("0.0000");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (Math.abs(inv[i][j]) < 1e-8) { // 小於極小值視為 0
                    System.out.print("0");
                } else {
                    System.out.print(df.format(inv[i][j]));
                }

                if (j < 2) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // 計算 3x3 矩陣的行列式
    public static double determinant(double[][] m) {
        return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])
             - m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])
             + m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
    }

    // 計算反矩陣
    public static double[][] inverse(double[][] m, double det) {
        double[][] inv = new double[3][3];

        inv[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / det;
        inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) / det;
        inv[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / det;

        inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]) / det;
        inv[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / det;
        inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]) / det;

        inv[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / det;
        inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]) / det;
        inv[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / det;

        return inv;
    }
}