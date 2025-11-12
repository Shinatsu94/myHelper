import java.util.Scanner;
public class CSIE_41343203_1031_3a{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<=0||n>20){
			return;
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");	
			}
			System.out.println();
		}
	sc.close();
	}
}