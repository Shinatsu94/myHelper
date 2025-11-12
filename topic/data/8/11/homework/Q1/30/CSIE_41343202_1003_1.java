import java.util.Scanner;
public class CSIE_41343202_1003_1{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();

		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a);
		System.out.println(b);

		scanner.close();

	}
}

