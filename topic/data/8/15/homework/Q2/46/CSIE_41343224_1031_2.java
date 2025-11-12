/**
 * 程式名稱 : 陣列依序最大值
 * 
 * 功能說明： 使用者輸入陣列，依序輸出該位往後最大值
 *
 * 日期:2025/10/31
 *
 * 姓名:張竣傑
 *	
 * 學號:41343224
 * 
 * 請給我100分!!
 */
import java.util.Scanner;
public class CSIE_41343224_1031_2
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in); // 建立 Scanner 物件讀取使用者輸入
	    
	    int n = input.nextInt(); // 讀取陣列長度
	    int []array = new int[n]; // 建立長度為 n 的整數陣列
	    
	    // 讀取使用者輸入的陣列元素
	    for(int i = 0 ; i < n ; i++){
	        array[i] = input.nextInt();
	    }
	    
	    // 逐一計算每個位置往後的最大值
	    for(int i = 0 ; i < n ; i++){
	        
	        if(i == n-1){ // 如果是最後一個元素
	            System.out.print(-1); // 最後一個元素後面沒有其他元素，輸出 -1
	        }
	        else{
	            int max = array[i+1]; // 初始化 max 為下一個元素
	            
	            // 比較從 i+1 到最後的所有元素，找出最大值
	            for(int j = i+1 ; j < n ; j++){
	               if(array[j] > max) max = array[j];
	            }
	            
	            System.out.print(max); // 輸出該位置往後最大值
	            
	            if(i < n-1) System.out.print(" "); // 每個數字之間用空格分隔
	        }
	    }
	}
}
