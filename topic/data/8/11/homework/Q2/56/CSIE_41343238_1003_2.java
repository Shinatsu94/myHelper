import java.util.Scanner;
public class CSIE_41343238_1003_2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int max=(a>b)?a : b;
		max=(max>c)?max : c;
			
		
		int min=(a<b)?a : b;
		min=(min<c)?min : c;

		int  mid=a+b+c-max-min;

		System.out.println(min);
		System.out.println(mid);
		System.out.println(max);
	}
}