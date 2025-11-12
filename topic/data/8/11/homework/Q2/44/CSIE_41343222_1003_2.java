
import java.util.Scanner;
public class CSIE_41343222_1003_2{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		//System.out.print("請輸入第一個數字a:");
		int a=scanner.nextInt();
		//System.out.print("請輸入第二個數字b:");
		int b=scanner.nextInt();
		//System.out.print("請輸入第三個數字c:");
		int c=scanner.nextInt();
		int max,min,mid;
		max=(a>b)?(a>c?a:c):(b>c?b:c);
		min=(a<b)?(a<c?a:c):(b<c?b:c);
		mid=a+b+c-max-min;
		//System.out.print("最大值:"+max+"最小值:"+min+"中間值"+mid);
		System.out.println(min);
		System.out.println(mid);
		System.out.println(max);
	}
}