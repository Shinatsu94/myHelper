import java.util.Scanner;
public class CSIE_41343209_1003_3{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt();
		int all=0;
		for(int i=1;i<=100000;i++){
			int x=i;
			int sum=0;
			while(x>0){
				sum+=x%10;
				x/=10;
			}
			if(sum==a){
				all++;
			}
			
		}
		System.out.println(all);
	}
}
		