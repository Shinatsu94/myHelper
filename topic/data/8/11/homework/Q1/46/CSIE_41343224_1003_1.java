/**
 * 程式名稱 : 不使用第三個變數進行交換
 * 
 * 功能說明： 使用者輸入a,b,程式做交換後輸出
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

public class CSIE_41343224_1003_1{

	public static void main(String[] args) {

	       Scanner input = new Scanner(System.in);

	       int a = input.nextInt();
	       int b = input.nextInt();

	       a = a^b;
	       b = a^b;
	       a = a^b;

	       System.out.println(a);
	       System.out.println(b);
	}

}