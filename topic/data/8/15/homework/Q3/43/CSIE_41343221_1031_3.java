import java.util.Scanner;

public class CSIE_41343221_1031_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        
        if (scanner.hasNextInt()) {
            N = scanner.nextInt();
        } else {
            scanner.close();
            return;
        }

        if (N <= 0 || N > 20) {
            scanner.close();
            return;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        scanner.close();
    }
}