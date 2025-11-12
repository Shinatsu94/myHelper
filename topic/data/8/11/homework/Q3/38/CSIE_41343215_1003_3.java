import java.util.Scanner;
public class CSIE_41343215_1003_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targetSum = scanner.nextInt();
        int count = 0;
        int limit = 100000;
        for (int i = 1; i <= limit; i++) {
            int sumOfDigits = getDigitSum(i);
            // 如果位數總和等於我們想要的目標總和...
            if (sumOfDigits == targetSum) {
                count++;
            }
        }
        System.out.println(count);
        scanner.close();
    }
    private static int getDigitSum(int number) {
        int sum = 0;
        int currentNumber = number;
        while (currentNumber > 0) {
            int lastDigit = currentNumber % 10;
            sum += lastDigit;
            currentNumber /= 10;
        }
        return sum;
    }
}
