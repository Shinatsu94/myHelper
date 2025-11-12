import java.util.Scanner;
public class CSIE_41343109_2{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int a=(n/100)%10,b=(n/10)%10,c=n%10;
		boolean flag=(c>b&&b>a);
		
		if(flag)
		System.out.println( n + " is well-ordered number.");
		else System.out.println( n + " is not well-ordered number.");

	}
}