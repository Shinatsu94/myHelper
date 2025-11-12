
import java.util.Scanner;

public class csie_41343137_1003_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt(), count = 0;

        for (int i = 1; i <= 100000; i++) {
            int sum = 0, n = i;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            count += (sum == A) ? 1 : 0;
        }

        System.out.println(count);
    }
}
