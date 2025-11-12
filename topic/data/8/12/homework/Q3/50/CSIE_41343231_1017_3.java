import java.util.Scanner;

public class CSIE_41343231_1017_3{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int result = 0;

		while (num != 0 ){
			int digit = num % 10 ;
			result = result * 10 + digit;
			num /= 10;
		}
		
		System.out.println(result);
	}
}


