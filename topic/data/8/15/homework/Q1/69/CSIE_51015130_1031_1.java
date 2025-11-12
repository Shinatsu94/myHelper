import java.util.Scanner;
import java.util.Arrays;

public class CSIE_51015130_1031_1{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int score[] = new int[n];  
		
		for(int i=0;i<n;i++){
			score[i] =sc.nextInt();			
		}
		
		/*排序前
		for(int i=0;i<n;i++){
			System.out.print(score[i] +" ");			
		}*/

		Arrays.sort(score); //自然排序	
		//排序後	
		for(int i=0;i<n;i++){
			System.out.print(score[i] +" ");			
		}
				
	}
}