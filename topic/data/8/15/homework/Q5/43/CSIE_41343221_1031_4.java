import java.util.Scanner;

public class InverseMatrix3x3 {

    private static String formatOutput(double value) {
        if (Math.abs(value) < 0.0000001) {
            return "0";
        }
        return String.format("%.4f", value);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 3;
        double[][] A = new double[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (scanner.hasNextDouble()) {
                    A[i][j] = scanner.nextDouble();
                } else {
                    scanner.close();
                    return;
                }
            }
        }
        
        double det = 
            A[0][0] * (A[1][1] * A[2][2] - A[1][2] * A[2][1]) -
            A[0][1] * (A[1][0] * A[2][2] - A[1][2] * A[2][0]) +
            A[0][2] * (A[1][0] * A[2][1] - A[1][1] * A[2][0]);

        if (Math.abs(det) < 0.0000001) {
            System.out.println("Determinant is zero, the matrix is not invertible.");
            scanner.close();
            return;
        }

        double invDet = 1.0 / det;

        double[][] adjA = new double[N][N];

        adjA[0][0] = A[1][1] * A[2][2] - A[1][2] * A[2][1];
        adjA[0][1] = -(A[0][1] * A[2][2] - A[0][2] * A[2][1]);
        adjA[0][2] = A[0][1] * A[1][2] - A[0][2] * A[1][1];

        adjA[1][0] = -(A[1][0] * A[2][2] - A[1][2] * A[2][0]);
        adjA[1][1] = A[0][0] * A[2][2] - A[0][2] * A[2][0];
        adjA[1][2] = -(A[0][0] * A[1][2] - A[0][2] * A[1][0]);

        adjA[2][0] = A[1][0] * A[2][1] - A[1][1] * A[2][0];
        adjA[2][1] = -(A[0][0] * A[2][1] - A[0][1] * A[2][0]);
        adjA[2][2] = A[0][0] * A[1][1] - A[0][1] * A[1][0];


        double[][] invA = new double[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                invA[i][j] = invDet * adjA[i][j];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(formatOutput(invA[i][j]));
                
                if (j < N - 1) {
                    sb.append(" ");
                }
            }
            if (i < N - 1) {
                sb.append("\n");
            }
        }
        
        System.out.print(sb.toString());

        scanner.close();
    }
}