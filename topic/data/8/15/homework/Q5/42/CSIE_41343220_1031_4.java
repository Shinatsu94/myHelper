import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class CSIE_41343220_1031_4 {

    // 定義一個 NumberFormat 物件來控制輸出格式
    // 必須使用 #.0000 確保輸出四位小數，即使是 .0000 也要顯示
    private static final NumberFormat DF = new DecimalFormat("#0.0000");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. 讀取 3x3 矩陣 A
        double[][] a = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // 使用 double 類型以確保浮點數精度
                a[i][j] = sc.nextDouble(); 
            }
        }
        sc.close();

        // 2. 計算反矩陣
        double[][] invA = inverseMatrix(a);

        // 3. 列印結果
        if (invA != null) {
            printMatrix(invA);
        } else {
            // 處理行列式為零的情況（雖然題目範例未涉及，但這是反矩陣的必須檢查）
            // 實際競賽中通常會根據題目要求來決定輸出，這裡我們假設不需要特別處理，
            // 程式直接退出或輸出錯誤訊息。
             // System.out.println("No inverse matrix (Determinant is zero)");
        }
    }

    /**
     * 計算 3x3 矩陣 A 的行列式 (Determinant)
     */
    private static double determinant(double[][] a) {
        // det(A) = a(0,0)*[a(1,1)*a(2,2) - a(1,2)*a(2,1)] 
        //        - a(0,1)*[a(1,0)*a(2,2) - a(1,2)*a(2,0)] 
        //        + a(0,2)*[a(1,0)*a(2,1) - a(1,1)*a(2,0)]
        
        return a[0][0] * (a[1][1] * a[2][2] - a[1][2] * a[2][1])
             - a[0][1] * (a[1][0] * a[2][2] - a[1][2] * a[2][0])
             + a[0][2] * (a[1][0] * a[2][1] - a[1][1] * a[2][0]);
    }
    
    /**
     * 計算 3x3 矩陣 A 的反矩陣 A⁻¹
     * @return 反矩陣 (double[3][3])，若不可逆則返回 null。
     */
    public static double[][] inverseMatrix(double[][] a) {
        double det = determinant(a);
        
        // 設置一個極小的容忍值 (Epsilon)，判斷行列式是否接近 0 (不可逆)
        final double EPSILON = 1e-9; 
        if (Math.abs(det) < EPSILON) {
            return null; // 矩陣不可逆
        }
        
        // 1/det(A) 因子
        double invDet = 1.0 / det;
        
        // 宣告伴隨矩陣 Adj(A)
        double[][] adjA = new double[3][3];

        // 計算餘因子 (Cofactor) 並直接儲存到轉置位置，即計算伴隨矩陣 Adj(A) = Cᵀ
        
        // C(0,0) -> Adj(A)(0,0)
        adjA[0][0] = (a[1][1] * a[2][2] - a[1][2] * a[2][1]);
        // C(0,1) -> Adj(A)(1,0) (注意符號)
        adjA[1][0] = -(a[1][0] * a[2][2] - a[1][2] * a[2][0]);
        // C(0,2) -> Adj(A)(2,0)
        adjA[2][0] = (a[1][0] * a[2][1] - a[1][1] * a[2][0]);

        // C(1,0) -> Adj(A)(0,1) (注意符號)
        adjA[0][1] = -(a[0][1] * a[2][2] - a[0][2] * a[2][1]);
        // C(1,1) -> Adj(A)(1,1)
        adjA[1][1] = (a[0][0] * a[2][2] - a[0][2] * a[2][0]);
        // C(1,2) -> Adj(A)(2,1) (注意符號)
        adjA[2][1] = -(a[0][0] * a[2][1] - a[0][1] * a[2][0]);

        // C(2,0) -> Adj(A)(0,2)
        adjA[0][2] = (a[0][1] * a[1][2] - a[0][2] * a[1][1]);
        // C(2,1) -> Adj(A)(1,2) (注意符號)
        adjA[1][2] = -(a[0][0] * a[1][2] - a[0][2] * a[1][0]);
        // C(2,2) -> Adj(A)(2,2)
        adjA[2][2] = (a[0][0] * a[1][1] - a[0][1] * a[1][0]);

        // 3. 將伴隨矩陣的每個元素乘以 1/det(A) 得到反矩陣
        double[][] invA = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                invA[i][j] = adjA[i][j] * invDet;
            }
        }

        return invA;
    }

    /**
     * 列印矩陣，並格式化輸出：
     * 1. 元素為 0 則直接印出 '0'
     * 2. 否則格式化為四位小數
     * 3. 行尾換行，且最後一行不得有多餘空格
     */
    private static void printMatrix(double[][] m) {
        final double EPSILON = 1e-6; // 用於判斷是否為零的容忍值
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                double val = m[i][j];
                
                // 檢查值是否接近零
                if (Math.abs(val) < EPSILON) {
                    System.out.print("0");
                } else {
                    // 格式化輸出到小數點後四位
                    System.out.print(DF.format(val));
                }

                // 輸出格式控制：
                // 1. 每行三個元素
                // 2. 除了每行最後一個元素，其他元素後印出空格
                if (j < 2) {
                    System.out.print(" ");
                }
            }
            // 每行結束後換行
            System.out.println();
        }
    }
}