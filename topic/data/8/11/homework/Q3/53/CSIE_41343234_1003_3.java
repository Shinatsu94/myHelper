import java.util.Scanner;

public class csie_41343234_1003_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int count = 0;

        for (int i = 1; i <= 100000; i++) {
            int sum = digitSum(i);
            count += (sum == A) ? 1 : 0;
        }

        System.out.println(count);
    }

    public static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
