import java.util.Scanner;
public class CSIE_41343209_1003_1{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		//System.out.println("befor a="+a+" b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+"\n"+b);
	}
}
		