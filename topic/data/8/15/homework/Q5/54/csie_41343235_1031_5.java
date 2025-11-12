import java.util.Scanner;
import java.text.DecimalFormat;

public class csie_41343235_1031_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] A = new double[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = sc.nextDouble();
            }
        }

        sc.close();

        double det = A[0][0]*(A[1][1]*A[2][2]-A[1][2]*A[2][1])
                   - A[0][1]*(A[1][0]*A[2][2]-A[1][2]*A[2][0])
                   + A[0][2]*(A[1][0]*A[2][1]-A[1][1]*A[2][0]);

        if (det == 0) {
            System.out.println("Matrix is singular, cannot find inverse.");
            return;
        }

        double[][] inv = new double[3][3];

        inv[0][0] =  (A[1][1]*A[2][2] - A[1][2]*A[2][1])/det;
        inv[0][1] = -(A[0][1]*A[2][2] - A[0][2]*A[2][1])/det;
        inv[0][2] =  (A[0][1]*A[1][2] - A[0][2]*A[1][1])/det;

        inv[1][0] = -(A[1][0]*A[2][2] - A[1][2]*A[2][0])/det;
        inv[1][1] =  (A[0][0]*A[2][2] - A[0][2]*A[2][0])/det;
        inv[1][2] = -(A[0][0]*A[1][2] - A[0][2]*A[1][0])/det;

        inv[2][0] =  (A[1][0]*A[2][1] - A[1][1]*A[2][0])/det;
        inv[2][1] = -(A[0][0]*A[2][1] - A[0][1]*A[2][0])/det;
        inv[2][2] =  (A[0][0]*A[1][1] - A[0][1]*A[1][0])/det;

        DecimalFormat df = new DecimalFormat("0.0000");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (inv[i][j] == 0) {
                    System.out.print("0");
                } else {
                    System.out.print(df.format(inv[i][j]));
                }
                if (j != 2) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}