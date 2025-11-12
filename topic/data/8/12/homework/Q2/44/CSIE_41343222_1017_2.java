import java.util.Scanner;
public class CSIE_41343222_1017_2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		//System.out.println("請輸入你想要監測的數字:");
		int goal=scanner.nextInt();
		int a=goal%10;
		boolean i=true;
		int c=goal;
		while(c>=10){
			c/=10;
			int b=c%10;
			if(a<=b){
				i=false;
				break;
			}
			a=b;
		}
		if(i) System.out.print(""+goal+" is well-ordered number.");
		else System.out.print(""+goal+" is not well-ordered number.");
	}
}
			