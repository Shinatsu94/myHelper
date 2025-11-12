import java.util.Scanner;
public class CSIE_41343203_1003_3{
	
public static int a(int n){
	int sum=0;
	while(n>0){
	sum+=n%10;
	n=n/10;
	}

return sum;
}

public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int count=0;
		for(int i=0;i<=100000;i++){
			if(a(i)==a){
			count++;
			}

		}	

	System.out.println(count);
	sc.close();
	}
}