import java.util.Scanner;

public class CSIE_41343202_1031_3A{
	 public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		   
		int n=scanner.nextInt();

		if(n<=0||n>20){
			System.out.println("錯誤");
			return;
		}

		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}

		scanner.close();
	}
}


