import java.util.Scanner;
public class CSIE_41343238_1003_3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int count=0;
		for(int i=1;i<=100000;i++)
		{
			
			int tmp=i,box=0;
			while(tmp!=0)
			{
				box+=tmp%10;
				tmp=tmp/10;
				            
			}
			if(box==a)
			{
				count++;
			}
		}
		System.out.println(count);
	}	
			
}