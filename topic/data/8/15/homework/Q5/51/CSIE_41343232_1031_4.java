import java.util.Scanner;

public class InverseMatrix3x3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[][] a = new double[3][3];

        // Read matrix
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                a[i][j] = in.nextDouble();
            }
        }

        // Determinant
        double det =
            a[0][0]*(a[1][1]*a[2][2] - a[1][2]*a[2][1]) -
            a[0][1]*(a[1][0]*a[2][2] - a[1][2]*a[2][0]) +
            a[0][2]*(a[1][0]*a[2][1] - a[1][1]*a[2][0]);

        double[][] cof = new double[3][3];
        cof[0][0] =  (a[1][1]*a[2][2] - a[1][2]*a[2][1]);
        cof[0][1] = -(a[1][0]*a[2][2] - a[1][2]*a[2][0]);
        cof[0][2] =  (a[1][0]*a[2][1] - a[1][1]*a[2][0]);

        cof[1][0] = -(a[0][1]*a[2][2] - a[0][2]*a[2][1]);
        cof[1][1] =  (a[0][0]*a[2][2] - a[0][2]*a[2][0]);
        cof[1][2] = -(a[0][0]*a[2][1] - a[0][1]*a[2][0]);

        cof[2][0] =  (a[0][1]*a[1][2] - a[0][2]*a[1][1]);
        cof[2][1] = -(a[0][0]*a[1][2] - a[0][2]*a[1][0]);
        cof[2][2] =  (a[0][0]*a[1][1] - a[0][1]*a[1][0]);

        double invDet = 1.0 / det;

        // Print inverse matrix
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                double val = cof[j][i] * invDet;

                if (Math.abs(val) < 1e-12) {
                    System.out.print("0");
                } else {
                    System.out.printf("%.4f", val);
                }

                if (j < 2) System.out.print(" ");
            }
            if (i < 2) System.out.println();
        }

        in.close();
    }
}
