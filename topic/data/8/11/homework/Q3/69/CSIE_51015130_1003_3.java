import java.util.Scanner;

public class CSIE_51015130_1003_3{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int s= sc.nextInt();
		int sum =0, a, b;
		
		for(int i=1;i<=100000;i++){
			a=0;b=i;

			do{	
				a=a+(b%10);
				b=b/10;
			}while(b>0);
			
			if(a==s) sum++;
		}

		System.out.println(sum);		
	}
}