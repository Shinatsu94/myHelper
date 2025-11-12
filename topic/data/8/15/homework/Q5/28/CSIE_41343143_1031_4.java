import java.util.Scanner;
public class MatrixInverse_3x3_Format {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] A = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = input.nextDouble();
            }
        }
        double det = A[0][0] * (A[1][1] * A[2][2] - A[1][2] * A[2][1])
                   - A[0][1] * (A[1][0] * A[2][2] - A[1][2] * A[2][0])
                   + A[0][2] * (A[1][0] * A[2][1] - A[1][1] * A[2][0]);

        if (det == 0) {
            System.out.println("This matrix has no inverse (det=0)");
            return;
        }
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
        double[][] inv = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inv[i][j] = adj[i][j] / det;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                double val = inv[i][j];
                if (Math.abs(val) < 1e-6) {
                    System.out.print("0");
                } else {
                    System.out.printf("%.4f", val);
                }
                if (j < 2) System.out.print(" ");
            }
            if (i < 2) System.out.println();
        }
    }
}
