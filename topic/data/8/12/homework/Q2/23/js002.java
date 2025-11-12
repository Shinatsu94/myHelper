import java.util.Scanner;
public class js002{
	public static void main(String[] args)throws Exception {
		int a=0,n=0,m=1,c=1,b=0;
		Scanner s = new Scanner(System.in); 
		a = s.nextInt();
		b=a;
		while(a/10!=0){
			c=b%10;
			m=b/10%10;
			if(m>=c){
				n=1;
			}
			if(m==0){
				break;
			}
			b/=10;
		}
		if(n==0){
			System.out.println(""+a+" is well-ordered number.");
		}else{
			System.out.println(""+a+" is not well-ordered number.");
		}
       }

    }