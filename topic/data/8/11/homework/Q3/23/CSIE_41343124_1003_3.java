import java.util.Scanner;
public class js131{
	public static void main(String[] args)throws Exception {
		int a=0,n=0,m=0;
		Scanner s = new Scanner(System.in); 
		a = s.nextInt();
		for(int i=1;i<=100000;i++){
                	m+=i%10;
			m+=i/10%10;
			m+=i/100%10;
			m+=i/1000%10;
			m+=i/10000%10;
			m+=i/100000;
			if(m==a){
				n+=1;
			}
			m=0;
		}
		System.out.println(n);

       }

    }