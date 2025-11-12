import java.util.Scanner;
public class CSIE_41343209_1017_3{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt();
		int r=0;
		while(a>0){
			int d=a%10;
			r=r*10+d;
			a/=10;
			
		}
		System.out.println(r);
	}
}