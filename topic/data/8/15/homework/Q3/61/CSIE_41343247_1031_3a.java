/*
Name:盧冠宇
Student_ID:41343247
*/
import java.util.Scanner;

public class CSIE_41343247_1031_3a {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		char array[][];
		int nu;
		nu=scanner.nextInt();
		array=new char[nu][];
		for(int x=0;x<nu;x++){
			array[x]=new char[x+1];
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] ='*';
			}
		}
		for(int i=0;i<nu;i++){
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
		System.out.println();
		}
   	 }
}