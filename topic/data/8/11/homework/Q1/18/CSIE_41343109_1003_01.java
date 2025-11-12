import java.util.Scanner;
public class CSIE_41343109_1003_01{
	public static void main(String[] args){
		Scanner scn= new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a);
		System.out.println(b);

}
}