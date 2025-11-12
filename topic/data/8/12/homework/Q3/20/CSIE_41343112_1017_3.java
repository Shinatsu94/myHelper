import java.util.Scanner;
public class CSIE_41343112_1017_3{
	public static void main(String arg[]){
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int sum=0; 
	for(int i=n;i>0;i/=10){	
		sum=sum*10+(i%10);
		}
	System.out.println(sum);
	}
}