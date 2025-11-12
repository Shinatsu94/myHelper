import java.util.Scanner;

public class CSIE_41343231_1003_1{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		
		int a = sc.nextInt() ,b = sc.nextInt();



		
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
	  	System.out.println(a); 
		System.out.println(b);

	}
}