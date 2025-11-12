import java.util.Scanner;
public class CSIE_41343222_1017_3{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt();
		boolean r=true;
		while(a>0){
			int b=a%10;
			if (b != 0) r = false;
			if(b!=0||!r)System.out.print(b);
			a/=10;
		}
	}
}