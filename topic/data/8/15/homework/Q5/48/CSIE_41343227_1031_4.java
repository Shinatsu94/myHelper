import java.util.*;

public class CSIE_41343227_1031_4 {
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

        // 計算行列式(det)
        double det =
                A[0][0]*(A[1][1]*A[2][2] - A[1][2]*A[2][1]) -
                A[0][1]*(A[1][0]*A[2][2] - A[1][2]*A[2][0]) +
                A[0][2]*(A[1][0]*A[2][1] - A[1][1]*A[2][0]);

        if (Math.abs(det) < 1e-9) {
            System.out.println("此矩陣沒有反矩陣。");
            return;
        }

        // 計算伴隨矩陣 (Adjugate Matrix)
        double[][] adj = new double[3][3];

        adj[0][0] =  (A[1][1]*A[2][2] - A[1][2]*A[2][1]);
        adj[0][1] = -(A[1][0]*A[2][2] - A[1][2]*A[2][0]);
        adj[0][2] =  (A[1][0]*A[2][1] - A[1][1]*A[2][0]);

        adj[1][0] = -(A[0][1]*A[2][2] - A[0][2]*A[2][1]);
        adj[1][1] =  (A[0][0]*A[2][2] - A[0][2]*A[2][0]);
        adj[1][2] = -(A[0][0]*A[1][2] - A[0][2]*A[1][0]);

        adj[2][0] =  (A[0][1]*A[1][2] - A[0][2]*A[1][1]);
        adj[2][1] = -(A[0][0]*A[1][2] - A[0][2]*A[1][0]);
        adj[2][2] =  (A[0][0]*A[1][1] - A[0][1]*A[1][0]);

        // 轉置（Adjugate = Cofactor^T）
        double[][] adjT = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                adjT[i][j] = adj[j][i];
            }
        }

        // 反矩陣 = (1/det) * adjT
        double[][] inv = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inv[i][j] = adjT[i][j] / det;
            }
        }

        // 輸出反矩陣（格式要求）
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                double val = inv[i][j];
                // 若為 -0.0000 或接近 0，直接印 0
                if (Math.abs(val) < 1e-6) {
                    System.out.print("0");
                } else {
                    System.out.printf("%.4f", val);
                }
                // 元素之間加空白，行尾不加
                if (j != 2) System.out.print(" ");
            }
            if (i != 2) System.out.println();
        }
    }
}
