/*
Name:盧冠宇
Student_ID:41343247
*/
import java.util.Scanner;

public class CSIE_41343247_1031_2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int array[],nu;
		nu=scanner.nextInt();
		array=new int[nu];
		for(int x=0;x<nu;x++){
			array[x]=scanner.nextInt();
		}
		for(int x=0;x<nu-1;x++){
			int big=x+1;
			for(int y=x+1;y<nu;y++){
				if(array[big]<array[y])big=y;
			}
			array[x]=array[big];
		}
		array[nu-1]=-1;
		for(int x=0;x<nu;x++){
			System.out.print(array[x]);
			if(x<nu-1)System.out.print(" ");
		}
   	 }
}