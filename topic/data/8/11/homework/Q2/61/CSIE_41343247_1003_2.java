/*
Name:盧冠宇
Student_ID:41343247
*/
import java.util.Scanner;
public class CSIE_41343247_1003_2{
	public static void main(String[] args){
		int max=0,min=0,mid=0;
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		max=(a>b) ? (a>c ? a : (b>c ? b : c)) : (b>c ? b : c);
		min=(a<b) ? (a<c ? a : (b<c ? b : c)) : (b<c ? b : c);
		mid=a+b+c-max-min;
		System.out.println(min);
		System.out.println(mid);
		System.out.println(max);
	}
}