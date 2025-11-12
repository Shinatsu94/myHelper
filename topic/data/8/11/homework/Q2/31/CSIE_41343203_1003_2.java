import java.util.Scanner;
public class CSIE_41343203_1003_2{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	
	int a=sc.nextInt();
	
	int b=sc.nextInt();
	
	int c=sc.nextInt();
	
	int max,min,mid;
	max=(a>b)?a:b;	
	max=(c>max)?c:max;

	min=(a<b)?a:b;	
	min=(c<min)?c:min;

	mid=a+b+c-max-min;

	System.out.println(min);
	System.out.println(mid);
	System.out.println(max);
	sc.close();
	}
}