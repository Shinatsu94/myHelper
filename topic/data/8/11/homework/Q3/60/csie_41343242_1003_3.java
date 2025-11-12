import java.util.Scanner;

public class csie_41343242_1003_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int count = 0;

        for (int i = 1; i <= 100000; i++) {
            if (digitSum(i) == A) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static int digitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
