import java.util.Scanner;
public class CSIE_41343219_1031_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] matx = new double[3][3];

        for (int i = 0; i < 9; i++)
                matx[i/3][i%3] = sc.nextDouble();
        sc.close();

        double det = Det(matx);
        if(det == 0) return;

        double[][] inverse = Inverse(matx, det);

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(inverse[i][j] == 0)
                    System.out.print("0");
                else
                    System.out.printf("%.4f", inverse[i][j]);
                if(j!=2)
                    System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static double Det(double[][] m) {
        return m[0][0] * (m[1][1]*m[2][2] - m[1][2]*m[2][1])
             - m[0][1] * (m[1][0]*m[2][2] - m[1][2]*m[2][0])
             + m[0][2] * (m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }


    public static double[][] Inverse(double[][] m, double det) {
        double[][] inv = new double[3][3];

        inv[0][0] = (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / det;
        inv[0][1] = (m[0][2]*m[2][1] - m[0][1]*m[2][2]) / det;
        inv[0][2] = (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / det;

        inv[1][0] = (m[1][2]*m[2][0] - m[1][0]*m[2][2]) / det;
        inv[1][1] = (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / det;
        inv[1][2] = (m[0][2]*m[1][0] - m[0][0]*m[1][2]) / det;

        inv[2][0] = (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / det;
        inv[2][1] = (m[0][1]*m[2][0] - m[0][0]*m[2][1]) / det;
        inv[2][2] = (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / det;

        return inv;
    }
}