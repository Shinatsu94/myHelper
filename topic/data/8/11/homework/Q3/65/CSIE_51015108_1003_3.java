import java.util.Scanner;
public class CSIE_51015108_1003_3
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b=0,c=0,d=0;

		    for (int i=1;i<=100000;i++ )
		    {
		        b=0;
		        if(i/100000!=0)
		        {
		            b=b+1;
		        }
		        if(i/10000!=0)
		        {
		            b=b+i/10000;
		        }
		        if(i/1000!=0)
		        {   
		            b=b+((i%10000)/1000);
		        }
		        if(i/100!=0)
		        {
		            b=b+((i%1000)/100);
		        }
		        if(i/10!=0)
		        {
		            b=b+((i%100)/10);
		           
		        }
		        
		      
		            b=b+i%10;
		            
		        
		        if(b==a)
		        {
		            c++;
		        }
		    }
		System.out.println(c);
	}
}