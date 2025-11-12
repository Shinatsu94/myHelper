import java.util.Scanner;
public class CSIE_41343222_1003_3{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int goal=scanner.nextInt();
		int total=0;
		for(int i=1;i<=100000;i++){
			int sum=0;
			int b=i;			
			while(b>0){				
				sum+= b%10;
				b/=10;
			}
			if(sum==goal)total++;
		}
	System.out.print(total);
	}
}
				
		