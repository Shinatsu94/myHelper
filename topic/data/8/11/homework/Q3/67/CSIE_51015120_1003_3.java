import java.util.Scanner;

public class CSIE_51015120_1003_3
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int count=0;
		int sum=0;
		int a;
		
		if(number < 1 || number > 45)
		{
		    System.out.println(0);
		    return; //防止進迴圈
		}
		
		for(int i=1;i<=100000;i++)
		{
		    a=i; 
		    while(a>0)
		    {
		        sum+=a%10; //把每位數抓出來
		        a=a/10;
		    }
		    if(sum==number)
		    {
		        count++;
		    }
		    sum=0;
		}
		
		System.out.println(count);
	}
}
