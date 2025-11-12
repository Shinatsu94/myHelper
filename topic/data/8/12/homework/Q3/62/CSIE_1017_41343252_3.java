import java.util.Scanner;
public class CSIE_1017_41343252_1{
	public static void main(String[] args){
		Scanner in =new Scanner(System.in);
		int n,nl,i=0;
		boolean t=false;
		n=in.nextInt();
		nl=n;
		while(nl>0){
			if(nl%10!=0){
				System.out.print(nl%10);
				i++;
			}
			else if(nl%10==0&&i>0)
				System.out.print(nl%10);
			nl=nl/10;	
		}
	}
}