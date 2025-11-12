import java.util.Scanner;
public class CSIE_1017_41343252_2{
	public static void main(String[] args){
		Scanner in =new Scanner(System.in);
		int n,nl,i=1;
		n=in.nextInt();
		nl=n;
		while(nl%10!=0){
			if(nl%10<=(nl/10)%10){
				System.out.println(n+" is not well-ordered number.");
				break;
			}
			nl=nl/10;	
		}
		if(nl==0)
			System.out.println(n+" is well-ordered number.");
	}
}