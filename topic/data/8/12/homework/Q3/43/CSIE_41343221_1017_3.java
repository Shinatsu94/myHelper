import java.util.Scanner;

public class CSIE_41343221_1017_3 {

    public static int reverseNumber(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int input = scanner.nextInt();

        int reversed = reverseNumber(input);

        System.out.println(reversed);

        scanner.close();
    }
}
