/*
Name:盧冠宇
Student_ID:41343247
*/
import java.util.Scanner;
public class CSIE_41343247_1003_1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		a^=b;b^=a;a^=b;
		System.out.println(a);
		System.out.println(b);
	}
}