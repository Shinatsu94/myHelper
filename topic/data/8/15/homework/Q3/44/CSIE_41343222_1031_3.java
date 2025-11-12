import java.util.Scanner;
public class CSIE_41343222_1031_3{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int y=scanner.nextInt();
		for(int q=1;q<=y;q++){
			for(int w=1;w<=q;w++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}