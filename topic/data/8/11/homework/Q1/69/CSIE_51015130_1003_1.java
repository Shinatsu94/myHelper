import java.util.Scanner;

public class CSIE_51015130_1003_1{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
	
		a=a^b;  //a=a^b
		b=a^b;  //b=(a^b)^b=a
		a=a^b;  //a=(a^b)^a=b

		System.out.println(a);  //交換後
		System.out.println(b);

	}
}