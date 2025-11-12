/**
 * 程式名稱 : 找出1到100000中 數位相加符合使用者輸入的數量
 * 
 * 功能說明： 使用者輸入A，程式輸出符合數量
 *
 * 日期:2025/10/03
 *
 * 姓名:張竣傑
 *	
 * 學號:41343224
 * 
 * 請給我100分!!
 */
import java.util.Scanner;

public class CSIE_41343224_1003_3{

	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    
	    int A = input.nextInt();
	    int count = 0;
	    
	    if(A<=45){
    	    for(int i = 1 ; i <= 100000;i++){
    	        int x = i;
    	        int sum = 0;
    	        while (x != 0){
    	            sum += x%10;
    	            x /= 10;
    	        }
    	        if (sum == A) count++;
    	    }
    	    System.out.println(count);
	    }
	    else 
	        System.out.println(0);
	}

}
