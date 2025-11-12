/**
 * 程式名稱 : 反矩陣
 * 
 * 功能說明： 輸入3*3的矩陣，輸出反矩陣
 *
 * 日期:2025/10/31
 *
 * 姓名:張竣傑
 *	
 * 學號:41343224
 * 
 * 請給我5分!!
 */
import java.util.Scanner;
public class CSIE_41343224_1031_4
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in); // 建立 Scanner 物件讀取使用者輸入
	    
	    // 建立 3x3 的矩陣，先建立行陣列
	    double matrix[][] = new double[3][];
	    for(int i = 0 ; i < 3 ; i++){
	        matrix[i] = new double[3]; // 每一行建立 3 個欄位
	    }
	    
	    // 讀取使用者輸入的 3x3 整數矩陣
	    for(int i = 0 ; i < 3 ; i++){
	        for(int j = 0 ; j < 3 ; j++){
	            matrix[i][j] = input.nextInt(); // 輸入元素存入矩陣
	        }
	    }
	    
	    // 計算 3x3 矩陣的行列式 det
	    double det =  matrix[0][0]*(matrix[1][1]*matrix[2][2] - matrix[1][2]*matrix[2][1])
                    - matrix[0][1]*(matrix[1][0]*matrix[2][2] - matrix[1][2]*matrix[2][0])
                    + matrix[0][2]*(matrix[1][0]*matrix[2][1] - matrix[1][1]*matrix[2][0]);
        
	    // 建立反矩陣 inv，先建立行陣列
        double inv[][] = new double[3][];
        for(int i = 0 ; i < 3 ; i++){
	        inv[i] = new double[3]; // 每行建立 3 個欄位
	    }
	    
	    // 計算反矩陣各個元素 (使用公式，不用 a,b,c 表示)
        inv[0][0] = (matrix[1][1]*matrix[2][2] - matrix[1][2]*matrix[2][1]) / det;
        inv[0][1] = (matrix[0][2]*matrix[2][1] - matrix[0][1]*matrix[2][2]) / det;
        inv[0][2] = (matrix[0][1]*matrix[1][2] - matrix[0][2]*matrix[1][1]) / det;

        inv[1][0] = (matrix[1][2]*matrix[2][0] - matrix[1][0]*matrix[2][2]) / det;
        inv[1][1] = (matrix[0][0]*matrix[2][2] - matrix[0][2]*matrix[2][0]) / det;
        inv[1][2] = (matrix[0][2]*matrix[1][0] - matrix[0][0]*matrix[1][2]) / det;

        inv[2][0] = (matrix[1][0]*matrix[2][1] - matrix[1][1]*matrix[2][0]) / det;
        inv[2][1] = (matrix[0][1]*matrix[2][0] - matrix[0][0]*matrix[2][1]) / det;
        inv[2][2] = (matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0]) / det;
	    
	    // 輸出反矩陣，並處理 -0.000 顯示為 0
	    for(int i = 0 ; i < 3 ; i++){
	        for(int j = 0 ; j < 3 ; j++){
		        if(inv[i][j] == -0.000) // 如果是負零，改成 0
			        System.out.print(+0);
		        else{
	                System.out.printf("%.4f", inv[i][j]); // 以小數點四位輸出
                        if (j < 2) System.out.print(" "); // 每列元素之間空格
		        }
	        }
	        System.out.print("\n"); // 換行
	    }
	}
}
