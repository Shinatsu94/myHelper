/*
Name:盧冠宇
Student_ID:41343247
*/
import java.util.Scanner;

public class CSIE_41343247_1031_1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int array[],nu;
		nu=scanner.nextInt();
		array=new int[nu];
		for(int x=0;x<nu;x++){
			array[x]=scanner.nextInt();
		}
		for(int x=0;x<nu;x++){
			int n=x;
			for(int y=x;y<nu;y++){
				if(array[y]<array[n])n=y;
			}
			if(n!=x){
				array[x]^=array[n];
				array[n]^=array[x];
				array[x]^=array[n];
			}
		}
		for(int x=0;x<nu;x++){	
			System.out.print(array[x]);
			if(x<nu-1)System.out.print(" ");
		}
   	 }
}