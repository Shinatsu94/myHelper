import java.util.Scanner;

public class CSIE_51015130_1017_3{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int s= sc.nextInt();
		int a[]={0,0,0,0}, b=0, sum;
		
		while(s!=0){
			b=0; sum=0;
			while(s!=0){
				a[b]=s%10;
				s=s/10;
				b++;
			}
		
			for(int i=0;i<b;i++){
				sum=sum*10+a[i];
			}

			System.out.println(sum); 
			s= sc.nextInt();
		}		
	}
}