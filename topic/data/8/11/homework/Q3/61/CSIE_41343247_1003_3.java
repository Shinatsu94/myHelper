/*
Name:盧冠宇
Student_ID:41343247
*/
import java.util.Scanner;
public class CSIE_41343247_1003_3{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt();
		int sum=0;
		for(int n=1;n<=100000;n++){
			if((n/100000 + n/10000%10 + n/1000%10 + n/100%10 + n/10%10 + n%10)==a)sum++;
		}
		System.out.println(sum);
	}
}