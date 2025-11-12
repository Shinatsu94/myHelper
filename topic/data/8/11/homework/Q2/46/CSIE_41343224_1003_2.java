/**
 * 程式名稱 : 找出最小中間與最大值且中值不使用判斷
 * 
 * 功能說明： 使用者輸入a,b,c，程式輸出由上到下由小到大
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

public class CSIE_41343224_1003_2{

	public static void main(String[] args) {

	       Scanner input = new Scanner(System.in);

	       int a = input.nextInt();
	       int b = input.nextInt();
	       int c = input.nextInt();

	       int max,min,mid;

	       max = (a>b)? ((a>c)? a:c):((b>c)?b:c);
	       min = (a<b)? ((a<c)? a:c):((b<c)?b:c);
	       mid = a+b+c-max-min;

	       System.out.println(min);
	       System.out.println(mid);
               System.out.println(max);
	}

}