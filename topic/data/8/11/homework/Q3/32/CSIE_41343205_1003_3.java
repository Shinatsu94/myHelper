import java.util.Scanner;

public class CSIE_41343205_1003_3{

	public static int sum(int n){
		int sum=0;

		while(n>0){
			sum=sum+n%10;
			n=n/10;
		}
	return sum;
}

	public static void main(String[] args){

		
		Scanner sc=new Scanner(System.in);

		int a=sc.nextInt();
		
		int count=0;

		for(int i=1;i<100000;i++){
			if(sum(i)==a){
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}


}