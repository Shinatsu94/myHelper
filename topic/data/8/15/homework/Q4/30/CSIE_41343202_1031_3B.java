import java.util.Scanner;

public class CSIE_41343202_1031_3B{
	 public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while(scanner.hasNext()){
			int n=scanner.nextInt();
			int num=scanner.nextInt();

			int total=n*(n+1)/2;
			if(num>total||num<1){
				System.out.println("not find "+ num +" in array.");
				return;
			}

			int row=1;
			int col=1;
			int curr=1;
			while(curr<num){
				if(col<row){
					col++;
				}else{
					row++;
					col=1;
				}
				curr++;
			}

			System.out.println(num+"["+row+", "+col+"]");
		}
		scanner.close();
	}
}

