import java.util.Scanner;
public class CSIE_41343143_1003_3 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int sum=0;
		int temp=0;
		int t=0;
		for(int i=1;i<=100000;i++){
		temp=i;
		sum=0;
		while(temp!=0)
		{
		sum=sum+(temp%10);
		temp/=10;
		
		}
		if(sum==a)
		{
		t++;
		}
		}
		System.out.print(t);
		sc.close();

	}
}