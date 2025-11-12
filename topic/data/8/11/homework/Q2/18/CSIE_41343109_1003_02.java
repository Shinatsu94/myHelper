import java.util.Scanner;
public class CSIE_41343109_1003_02{
	public static void main(String[] args){
		Scanner scn= new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=scn.nextInt();
		int max,mid,min;
			max=(a>b)?((a>c)?a:c):((b>c)?b:c);
			min=(a<b)?((a<c)?a:c):((b<c)?b:c);
			mid=a+b+c-max-min;
		System.out.println(min);
		System.out.println(mid);
		System.out.println(max);
}
}