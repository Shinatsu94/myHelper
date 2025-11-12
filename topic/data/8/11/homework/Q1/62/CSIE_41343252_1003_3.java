/*
//輸入a，判斷1~100000中，每個位數加總是否=a
//範例:
//input
//6
//output
//210
//
//
//
//
*/
import java.util.Scanner;
class CSIE_41343252_1003_3{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int a,b;
		int sum=0;
		int count=0;
		a=in.nextInt();
		for(int i=1;i<=100000;i++){
			if(a>45)
				break;
			if(i==a){
				count=count+1;
			}
			else if(i>=10){
				b=i;
				while(b>0){
					sum=sum+b%10;
					b=(b-b%10)/10;
				}
				if(sum==a){
					count=count+1;
				}
				sum=0;
			}
		}
		System.out.print(count);			
	}
}