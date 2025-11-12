import java.util.Scanner;

public class CSIE_41343205_1031_3b{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int num=sc.nextInt();
			int totala=n*(n+1)/2;
			if(num>totala||num<=0){
				System.out.print("not find "+num+" in array.");
				sc.close();
				return;
			}

			int row=1;
			int totalb=1;
			while(totalb<num){
				row++;
				totalb+=row;
			}
			int preTotal=totalb-row;
			int col=num-preTotal;
			
			System.out.println(num + "[" + row + ", " + col + "]");
			sc.close();
		}


}