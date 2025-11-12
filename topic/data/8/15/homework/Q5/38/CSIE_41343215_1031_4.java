import java.util.Scanner;
import java.text.DecimalFormat;
public class CSIE_41343215_1031_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");
        double[][] a = new double[3][3];
        for (int i = 0; i < 3; i++) for (int j = 0; j < 3; j++) a[i][j] = scanner.nextDouble();
        scanner.close();
        double[][] adj = new double[3][3];
        adj[0][0] = a[1][1] * a[2][2] - a[1][2] * a[2][1];
        adj[0][1] = -(a[0][1] * a[2][2] - a[0][2] * a[2][1]);
        adj[0][2] = a[0][1] * a[1][2] - a[0][2] * a[1][1];
        adj[1][0] = -(a[1][0] * a[2][2] - a[1][2] * a[2][0]);
        adj[1][1] = a[0][0] * a[2][2] - a[0][2] * a[2][0];
        adj[1][2] = -(a[0][0] * a[1][2] - a[0][2] * a[1][0]);
        adj[2][0] = a[1][0] * a[2][1] - a[1][1] * a[2][0];
        adj[2][1] = -(a[0][0] * a[2][1] - a[0][1] * a[2][0]);
        adj[2][2] = a[0][0] * a[1][1] - a[0][1] * a[1][0];
        double det = a[0][0] * adj[0][0] + a[0][1] * adj[1][0] + a[0][2] * adj[2][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                double val = adj[i][j] / det;
                if (val == 0.0) System.out.print("0");
                else System.out.print(df.format(val));
                if (j < 2) System.out.print(" ");
            }
            System.out.println();
        }
    }
}