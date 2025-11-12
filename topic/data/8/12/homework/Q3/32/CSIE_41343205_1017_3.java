import java.util.Scanner;

public class CSIE_41343205_1017_3{
	public static int Reverse(int n){
		int reversed=0;
		while(n!=0){
			int digit=n%10;
			reversed=reversed*10+digit;
			n/=10;

		}
		return reversed;
	}	

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int result=Reverse(num);
		System.out.println(result);
		sc.close();


	}




}