/**
 * 程式名稱 : 陣列選擇排序
 * 
 * 功能說明： 使用者輸入陣列，選擇排序後輸出
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
public class CSIE_41343224_1031_1
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in); // 建立 Scanner 物件讀取使用者輸入
	    
	    int n = input.nextInt(); // 讀取陣列長度
	    int []array = new int[n]; // 建立長度為 n 的整數陣列
	    
	    // 讀取使用者輸入的陣列元素
	    for(int i = 0 ; i < n ; i++){
	        array[i] = input.nextInt();
	    }
	    
	    // 使用選擇排序法對陣列進行排序
	    for(int i = 0 ; i < n-1 ; i++){
	        int min = i; // 假設當前 i 位置是最小值
	        
	        // 找出從 i+1 到最後的最小值索引
	        for(int j = i+1 ; j < n ; j++){
	            if(array[j] < array[min]) min = j;
	        }
	        
	        // 交換當前 i 與找到的最小值位置
	        int temp = array[i];
	        array[i] = array[min];
	        array[min] = temp;
	    }

	    // 輸出排序後的陣列
	    for(int i = 0 ; i < n ; i++){
	        System.out.print(array[i]);
	        if(i < n-1) System.out.print(" "); // 每個數字之間加空格
	    }
	}
}
