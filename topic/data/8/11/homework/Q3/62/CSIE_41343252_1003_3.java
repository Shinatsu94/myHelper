import java.util.Scanner;
class CSIE_41343252_1003_3{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int a,b;
		int sum=0;
		int count=0;
		a=in.nextInt();
		if(a<=45){
			for(int i=1;i<=100000;i++){
					b=i;
					while(b>0){
						sum=sum+b%10;
						b=b/10;
					}
					if(sum==a){
						count=count+1;
					}
					sum=0;
			}
		}
		System.out.println(count);			
	}
}