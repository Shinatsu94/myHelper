import java.util.Scanner;

public class CSIE_41343202_1031_4{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNextDouble()) {
            double[][] matrix = new double[3][3];
            
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (scanner.hasNextDouble()) {
                        matrix[i][j] = scanner.nextDouble();
                    } else {
                        return;
                    }
                }
            }
            
            double det = CD(matrix);
            
            if (Math.abs(det) < 1e-10) {
                System.out.println("矩陣不可逆");
                continue;
            }
            
            double[][] adjoint = CA(matrix);
            double[][] inverse = new double[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    inverse[i][j] = adjoint[i][j] / det;
                }
            }

            PM(inverse);
            System.out.println();
        }
        
        scanner.close();
    }
    
    public static double CD(double[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
             - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
             + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }
    
    public static double[][] CA(double[][] matrix) {
        double[][] adjoint = new double[3][3];
        
        adjoint[0][0] = matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1];
        adjoint[0][1] = -(matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]);
        adjoint[0][2] = matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0];
        
        adjoint[1][0] = -(matrix[0][1] * matrix[2][2] - matrix[0][2] * matrix[2][1]);
        adjoint[1][1] = matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0];
        adjoint[1][2] = -(matrix[0][0] * matrix[2][1] - matrix[0][1] * matrix[2][0]);
        
        adjoint[2][0] = matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1];
        adjoint[2][1] = -(matrix[0][0] * matrix[1][2] - matrix[0][2] * matrix[1][0]);
        adjoint[2][2] = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        
        return adjoint;
    }
    
    public static void PM(double[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                double value = Math.round(matrix[i][j] * 10000.0) / 10000.0;
                
                if (Math.abs(value) < 1e-5) {
                    value = 0.0;
                }
                
                if (j > 0) {
                    System.out.print(" ");
                }
                
                
                if (value == 0.0) {
                    System.out.print("0");
                } else {
                    System.out.printf("%.4f", value);
                }
            }
            if (i < 2) {
                System.out.println();
            }
        }
    }
}
