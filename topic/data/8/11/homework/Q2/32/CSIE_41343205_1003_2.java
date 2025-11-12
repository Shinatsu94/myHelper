import java.util.Scanner;

public class  CSIE_41343205_1003_2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		


		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();


		int max=(a>b?(a>c?a:c):(b>c?b:c));
		int min=(a<b?(a<c?a:c):(b<c?b:c));
		int mid=a+b+c-max-min;

		System.out.println(min);
		System.out.println(mid);
		System.out.println(max);	



	}



}