import java.util.Scanner;

public class CSIE_41343209_1031_3a{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
