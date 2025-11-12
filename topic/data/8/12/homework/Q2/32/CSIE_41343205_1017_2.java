import java.util.Scanner;

public class CSIE_41343205_1017_2{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		
		if(wellordered(n)) System.out.println(n+" is well-ordered number.");
		else System.out.println(n+" is not well-ordered number.");
		
		sc.close();

	} 
	
		public static boolean wellordered(int n){
			int prev=10;
		while(n>0){
			int a=n%10;
			n/=10;
			if(a>=prev) return false;
			prev=a;
		}
		return true;

		}

}