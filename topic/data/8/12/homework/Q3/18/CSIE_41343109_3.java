import java.util.Scanner;
public class CSIE_41343109_3{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int x=n;
		int count=0;
		while(x!=0){
		x/=10;
		count++;
		}
		x=n;
		int sum=0;
		while(count!=0){
		int d=0;
		d=x%10;
		sum=sum*10+d;
		count--;
		x=x/10;
		}
		System.out.println(sum);
	}	
}