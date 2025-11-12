import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		sn.close();
		
		int num = n;
		int temp = 0;
		int result = 0;
		while (num != 0) {
			temp = num%10;
			num /= 10;
			if (temp <= num%10) {
				result = 1;
				break;
			}
		}
		
		if (result == 0) System.out.printf("%d is well-ordered number.\n", n);
		else System.out.printf("%d is not well-ordered number.\n", n);
		
    }
}