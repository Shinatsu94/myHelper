import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] a = new double[3][3];
        
        // 讀入 3x3 矩陣
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                a[i][j] = sc.nextDouble();
        sc.close();

        double det = determinant(a);
        if (Math.abs(det) < 1e-9) {
            System.out.println("Matrix is singular and has no inverse.");
            return;
        }

        double[][] inv = inverse(a, det);

        // 輸出反矩陣，四捨五入到小數點後4位，若為0則輸出0
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                double val = inv[i][j];
                // 四捨五入至小數點後四位
                val = Math.round(val * 10000.0) / 10000.0;
                if (Math.abs(val) < 1e-9) {
                    System.out.print("0");
                } else {
                    System.out.printf("%.4f", val);
                }
                if (j < 2) System.out.print(" ");
            }
            System.out.println();
        }
    }

    // 計算 3x3 行列式
    private static double determinant(double[][] m) {
        return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])
             - m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])
             + m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
    }

    // 計算 3x3 矩陣的反矩陣
    private static double[][] inverse(double[][] m, double det) {
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
