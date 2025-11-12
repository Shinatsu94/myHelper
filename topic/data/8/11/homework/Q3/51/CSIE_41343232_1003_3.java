import java.util.Scanner;  
public class CSIE_41343232_1003_3
{
	public static void main(String[] args){
	  Scanner scan = new Scanner(System.in);
	  int a= scan.nextInt();
	  int temp=0;
	  int count=0;
	  for(int i=1;i<=100000;i++)
	    {
		int sum=0;
		temp=i;
		while(temp!=0)
		{
		sum=sum+(temp%10);
		temp=temp/10;
	    	}
		if(a==sum)
		  count++;
		sum=0;
	    }
	System.out.println(count);
	  scan.close();
	}
}
	  