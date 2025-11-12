import java.util.Scanner;
public class CSIE_41343109_1003_03{
	public static void main(String[] args){
		int a,b,c,d,e,f,flag,count=0;
		Scanner scn= new Scanner(System.in);
		int x=scn.nextInt();
		for(int i=1;i<=100000;i++){
			int sum=0;
			flag=i;
			a=flag%10;
			flag=flag/10;
			b=flag%10;
			flag=flag/10;
			c=flag%10;
			flag=flag/10;
			d=flag%10;
			flag=flag/10;
			e=flag%10;
			flag=flag/10;
			f=flag%10;
			flag=flag/10;
			sum=a+b+c+d+e+f;
			if(sum==x){count++;}
		}
		System.out.println(count);
		
}
}