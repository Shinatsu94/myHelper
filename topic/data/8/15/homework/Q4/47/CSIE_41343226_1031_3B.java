import java.util.Scanner;
public class CSIE_41343226_1031_3B{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int c=sc.nextInt();
		int i=0;
		int sum=0;
		while(sum<c){
			sum+=++i;
		}
		int ans=i+c-sum;
		if (m>=i){
			System.out.println(c+"["+i+", "+ans+"]");
		}
		else{
			System.out.println("not find "+c+" in array.");
		}
	}
}