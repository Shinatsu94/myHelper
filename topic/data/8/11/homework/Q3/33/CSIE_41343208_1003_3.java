import java.util.Scanner;

public class CSIE_41343208_1003_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        int A = sc.nextInt();

        int count = 0; 

        for (int i = 1; i <= 100000; i++) {
            int sum = 0, n = i;

            while (n > 0) {
                sum += n % 10; 
                n /= 10;       
            }

            if (sum == A) {
                count++;
            }
        }

        System.out.println( + count);
    }
}
