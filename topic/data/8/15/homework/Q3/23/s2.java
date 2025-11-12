import java.util.Scanner;
public class s2{
	public static void main(String[] args)throws Exception {
		int x=0;
		Scanner s = new Scanner(System.in); 
		x = s.nextInt();
		for(int i=1;i<=x;i++){
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

    }