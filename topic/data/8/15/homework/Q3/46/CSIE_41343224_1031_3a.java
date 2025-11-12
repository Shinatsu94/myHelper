/**
 * 程式名稱 : 二維陣列列出下三角
 * 
 * 功能說明： 二維陣列 然後列出三角形 符號是*
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
public class CSIE_41343224_1031_3a
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in); // 建立 Scanner 物件，用來接收使用者輸入
	    
	    int n = input.nextInt(); // 讀取整數 n，代表要輸出的三角形高度（行數）
	    
	    char matrix[][] = new char[n][]; // 宣告一個二維字元陣列（不規則陣列），共有 n 列
	    
	    // 動態建立每一列的長度
	    for(int i = 0;i < n ; i++){
	        matrix[i] = new char[i+1]; // 第 i 列有 i+1 個元素（形成三角形）
	    }
	    
	    // 依序填入 '*' 並印出
	    for(int i = 0 ;i < n ; i++){
	        for(int j = 0 ; j <= i ;j++){ // 內圈：每列要印出 j = 0 到 i 的星號
	            matrix[i][j] = '*'; // 將該位置設為 '*'
	            System.out.print(matrix[i][j]); // 立即輸出該星號
	        }
	        System.out.print("\n"); // 換行，開始印下一列
	    }
	}
}
