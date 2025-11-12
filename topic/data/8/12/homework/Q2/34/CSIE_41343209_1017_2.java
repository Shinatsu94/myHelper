import java.util.Scanner;
public class CSIE_41343209_1017_2{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt();
		int x=a;
		boolean b=true;
		while(x>0){
			int s=x%10;
			x/=10;
			int d=x%10;
			if(s>d){
				b=true;
			}
			else{
				b=false;
				break;
			}
		}
		if(b){
			System.out.println(a + " is well-ordered number.");
		}
		else{
			System.out.println(a + " is not well-ordered number.");
		}
		
	}
}