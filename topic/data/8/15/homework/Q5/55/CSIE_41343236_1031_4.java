import java.util.Scanner;

public class CSIE_41343236_1031_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] matrix = new double[3][3];
        
        // 讀取 3x3 矩陣
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }
        
        // 計算反矩陣
        double[][] inverse = getInverse(matrix);
        
        // 列印反矩陣
        if (inverse != null) {
            printMatrix(inverse);
        } else {
            System.out.println("矩陣不可逆");
        }
        
        scanner.close();
    }
    
    // 計算 3x3 矩陣的反矩陣
    public static double[][] getInverse(double[][] matrix) {
        // 計算行列式
        double det = getDeterminant(matrix);
        
        // 如果行列式為 0，矩陣不可逆
        if (Math.abs(det) < 1e-10) {
            return null;
        }
        
        // 計算伴隨矩陣
        double[][] adjugate = getAdjugate(matrix);
        
        // 反矩陣 = 伴隨矩陣 / 行列式
        double[][] inverse = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverse[i][j] = adjugate[i][j] / det;
            }
        }
        
        return inverse;
    }
    
    // 計算 3x3 矩陣的行列式
    public static double getDeterminant(double[][] matrix) {
        double det = matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                   - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                   + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        return det;
    }
    
    // 計算伴隨矩陣(餘因子矩陣的轉置)
    public static double[][] getAdjugate(double[][] matrix) {
        double[][] cofactor = new double[3][3];
        
        // 計算餘因子矩陣
        cofactor[0][0] = matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1];
        cofactor[0][1] = -(matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]);
        cofactor[0][2] = matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0];
        
        cofactor[1][0] = -(matrix[0][1] * matrix[2][2] - matrix[0][2] * matrix[2][1]);
        cofactor[1][1] = matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0];
        cofactor[1][2] = -(matrix[0][0] * matrix[2][1] - matrix[0][1] * matrix[2][0]);
        
        cofactor[2][0] = matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1];
        cofactor[2][1] = -(matrix[0][0] * matrix[1][2] - matrix[0][2] * matrix[1][0]);
        cofactor[2][2] = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        
        // 轉置餘因子矩陣得到伴隨矩陣
        double[][] adjugate = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                adjugate[i][j] = cofactor[j][i];
            }
        }
        
        return adjugate;
    }
    
    // 列印矩陣
    public static void printMatrix(double[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // 如果元素接近 0，直接列印 "0"
                if (Math.abs(matrix[i][j]) < 1e-10) {
                    System.out.print("0");
                } else {
                    // 格式化到小數點後四位
                    System.out.printf("%.4f", matrix[i][j]);
                }
                
                // 最後一個元素後不加空白
                if (j < 2) {
                    System.out.print(" ");
                }
            }
            // 換行
            if (i < 2) {
                System.out.println();
            }
        }
    }
}