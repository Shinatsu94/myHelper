/**
 * 程式名稱 : 找出數值在
 * 
 * 功能說明： 輸入一個數值，找出依序的三角形該數值出現在哪列哪行
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
public class CSIE_41343224_1031_3b
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in); // 建立 Scanner 物件，讀取使用者輸入
	    
	    int n = input.nextInt(); // 讀取整數 n，代表三角形陣列的總列數
	    int num = input.nextInt(); // 讀取要查找的數字 num
	    
	    int count = 0; // 用來記錄目前計數的數字（用來判斷 num 所在的位置）
	    int row = 0;   // 紀錄 num 所在的「列」索引（從 0 開始）
	    
	    // 外層 for 迴圈：模擬三角形數列的排列方式
	    // i 表示目前數列中該列的起始數字
	    // c 表示列數（從第 0 列開始）
	    // 每次迴圈 i += (c + 1) 表示往下一列的開頭位置
	    for(int i = 1 ,c = 0; c <= n ; c++, i += (c + 1)){
	        if(i >= num){ // 如果這列的開頭編號已經超過或等於 num，代表找到了
	            count = i; // 紀錄這列開頭的編號
	            row = c;   // 紀錄當前列號
		    break;     // 跳出迴圈
	        }
	    }
	    
	    // 計算 num 在該列的「欄」位置（從 0 開始）
	    int col = row - (count - num);
	    
	    // 如果 count 還是 0，代表沒有找到該數字
	    if(count == 0) 
	        System.out.println("not find "+num+" in array.");
	    else
	        // 若找到，則輸出 num 的座標（列與欄都是從 1 開始顯示）
	        System.out.println(num+"["+(row+1)+", "+(col+1)+"]");
	}
}
