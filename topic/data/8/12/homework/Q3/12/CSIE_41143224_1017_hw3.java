import java.util.Scanner;

public class ReverseDigitsThreeTimes {

    public static int reverseDigits(int num) {
        int sign = 1;
        if (num < 0) {
            sign = -1;
            num = Math.abs(num);
        }
        
        long reversedNum = 0;
        
        while (num != 0) {
            reversedNum = reversedNum * 10 + (num % 10);
            num /= 10;
        }
        
        return (int) (reversedNum * sign);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            if (scanner.hasNextInt()) {
                int inputNumber = scanner.nextInt();
                int reversed = reverseDigits(inputNumber);
                System.out.println(reversed);
            } else {
                              break; 
            }
        }
        
        scanner.close();
    }
}