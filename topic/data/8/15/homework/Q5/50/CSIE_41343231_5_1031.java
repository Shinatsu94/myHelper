import java.util.Scanner;

public class MatrixInverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double[][] a = new double[3][3];

        // 讀入 3x3 矩陣
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = s.nextDouble();
            }
        }
        s.close();

        double det = determinant(a);
        if (det == 0) {
            System.out.println("Matrix is singular and cannot be inverted.");
            return;
        }

        double[][] inv = inverse(a, det);

        // 輸出結果
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                double val = inv[i][j];
                if (Math.abs(val) < 1e-10) {
                    System.out.print("0");
                } else {
                    System.out.printf("%.4f", val);
                }
                if (j < 2) System.out.print(" ");
            }
            if (i < 2) System.out.println();
        }
    }

    // 計算行列式
    public static double determinant(double[][] m) {
        return m[0][0]*(m[1][1]*m[2][2] - m[1][2]*m[2][1])
             - m[0][1]*(m[1][0]*m[2][2] - m[1][2]*m[2][0])
             + m[0][2]*(m[1][0]*m[2][1] - m[1][1]*m[2][0]);
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
