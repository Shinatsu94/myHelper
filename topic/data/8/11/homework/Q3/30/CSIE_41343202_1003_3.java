import java.util.Scanner;

public class CSIE_41343202_1003_3{
		public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int A=scanner.nextInt();
		int count=0;

		for(int i=1;i<=100000;i++){
			if(sum0fDigits(i)==A){
				count++;
			}
		}
		System.out.println(count);
		scanner.close();
}
public static int sum0fDigits(int number){
		int sum=0;
		int n=number;

		while(n>0){
			sum+=n%10;
			n/=10;
		}
		

		return sum;
	}
		
}

 

