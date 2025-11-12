

import java.util.Scanner;

public class CSIE_41343223_1003_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                int A = scanner.nextInt();
                int B = scanner.nextInt();

        A = A + B;
        B = A - B;
        A = A - B;

        // 印出交換後的值
        System.out.println(A);
	System.out.println(B);
    }
}
