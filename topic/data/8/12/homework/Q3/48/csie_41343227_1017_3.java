import java.util.Scanner;

public class  csie_41343227_1017_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int reversed = reverse(number);
        System.out.println(reversed);
    }

    public static int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }
}
