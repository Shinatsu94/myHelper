import java.util.Scanner;


public class CSIE_41343231_1003_3{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
	
		int count = 0 ;  

		for (int i = 1 ; i <= 100000 ; i += 1){
				
			int temp = i , answer = 0;

			while (temp != 0 ){
				answer += temp % 10 ;
				temp =temp / 10;
				
	
			}if (answer == A ){
				count += 1;
			}
				
		
		}
System.out.println(count);

	}
}