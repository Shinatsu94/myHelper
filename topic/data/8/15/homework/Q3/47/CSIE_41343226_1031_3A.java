import java.util.Scanner;
public class CSIE_41343226_1031_3A{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		for(int i =0;i<c;i++){
			for(int j =0;j<i+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}