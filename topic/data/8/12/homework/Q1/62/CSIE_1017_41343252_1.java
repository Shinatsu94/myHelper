import java.util.Scanner;
public class CSIE_1017_41343252_1{
	public static void main(String[] args){
		double sum;
		int log=0;
		boolean logcheck=false;
		for(int i=10000;i<=100000;i+=10000){
			sum=0f;
			for(int j=1;j<=i;j++){
				if(j%2==0)
					sum=sum-1.0/(2*j-1.0);
				else
					sum=sum+1.0/(2*j-1.0);
			}
			System.out.printf("i = %6d, pi = %.10f\n",i,4*sum);
		}
		int j=1;
		sum=0;
		while(logcheck!=true){
			if(j%2==0)
				sum=sum-1.0/(2*j-1.0);
			else
				sum=sum+1.0/(2*j-1.0);
			if(4.0*sum>=3.14159&&4.0*sum<=3.1416){
				log=j;
				logcheck=true;	
				}
			j++;
		}
		System.out.printf("\ni = %6d);

	}
}