import java.util.Scanner;
public class CSIE_41343222_1003_1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		//System.out.println("請輸入第一個數字 a");
		int a= scanner.nextInt();
		//System.out.println("請輸入第二個數字 b");
		int b= scanner.nextInt();
		//System.out.println(a);
		//System.out.println(b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	}
}