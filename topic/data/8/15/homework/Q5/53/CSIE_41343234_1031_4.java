import java.util.*;

public class CSIE_41343234_1031_2  {
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

        if (det == 0) {
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
        adj[1][2] = -(A[0][0]*A[2][1] - A[0][1]*A[2][0]);

        adj[2][0] =  (A[0][1]*A[1][2] - A[0][2]*A[1][1]);
        adj[2][1] = -(A[0][0]*A[1][2] - A[0][2]*A[1][0]);
        adj[2][2] =  (A[0][0]*A[1][1] - A[0][1]*A[1][0]);

        // 轉置（因為 adj = Cofactor^T）
        double[][] adjT = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                adjT[i][j] = adj[j][i];
            }
        }

        // 反矩陣 = 1/det * adjT
        double[][] inv = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inv[i][j] = adjT[i][j] / det;
            }
        }

        // 印出反矩陣
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%.3f", inv[i][j]);
                if (j != 2) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
