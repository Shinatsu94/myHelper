/*
Name:盧冠宇
Student_ID:41343247
*/
import java.util.Scanner;

public class CSIE_41343247_1031_3b {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int nu,h,sum=0;
		h=scanner.nextInt();
		nu=scanner.nextInt();
		for(int x=0;x<h;x++){
			sum+=(x+1);
			if(sum>=nu){
				System.out.print(nu+"["+(x+1)+", "+(x-(sum-nu)+1)+"]");
				break;
			}else if(x==h-1){
				System.out.print("not find "+nu+" in array.");
				break;
			}
		}
   	 }
}