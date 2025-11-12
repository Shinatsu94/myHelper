import java.util.Scanner;
public class CSIE_41343202_1003_2{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();

		int max,min,mid;
		min=(a<b)?((a<c)?a:c):((b<c)?b:c);
		max=(a>b)?((a>c)?a:c):((b>c)?b:c);
		mid=a+b+c-max-min;
		System.out.println(min);
		System.out.println(mid);
		System.out.println(max);

		scanner.close();
	}
}


