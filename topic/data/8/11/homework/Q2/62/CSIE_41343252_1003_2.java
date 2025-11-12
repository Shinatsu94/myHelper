/*
//輸入a,b,c三個數，並且判斷他們的大中小
//範例:
//輸入a、b、c
//3
//1
//2
//
//3
//1
//2
*/
import java.util.Scanner;
class CSIE_41343252_1003{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int a,b,c,max,min;
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		max=(a>b?(a>c?a:c):(b>c?b:c));
		min=(a<b?(a<c?a:c):(b<c?b:c));
		System.out.println(min);
		System.out.println((a+b+c-max-min));			
		System.out.println(max);
			
	}
}