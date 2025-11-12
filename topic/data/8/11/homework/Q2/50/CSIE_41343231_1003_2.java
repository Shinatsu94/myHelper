import java.util.Scanner;

public class CSIE_41343231_1003_2{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		
		int a = sc.nextInt() ,b = sc.nextInt() ,c = sc.nextInt();
		
		
		
		int min = (a < b) ? a : b;
		min = (min < c) ? min : c;



		int max = (a > b) ? a : b;
		max = (max > c) ? max : c;

		int mid = a + b + c - max - min;

		System.out.println(min);
		System.out.println(mid);
		System.out.println(max);






	}
}