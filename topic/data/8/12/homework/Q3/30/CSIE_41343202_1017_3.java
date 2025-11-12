import java.util.Scanner;

public class CSIE_41343202_1017_3{
	private static int RN(int number){
		int re=0;
		int or=number;

		while(or!=0){
			int digit=or%10;
			re=re*10+digit;
			or/=10;
		}

		return re;
	}

	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);


		int number=scanner.nextInt();

		int re=RN(number);

		System.out.println(re);

		scanner.close();
	}
}

