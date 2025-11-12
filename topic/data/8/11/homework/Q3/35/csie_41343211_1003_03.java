import java.util.Scanner;

public class csie_41343211_1003_03{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        
        if (A < 0 || A > 100) {
            System.out.println("A 的值無效，應為 0 到 100 之間");
            return;
        }
        
        int count = 0;
        for (int i = 1; i <= 100000; i++) {
            if (sumOfDigits(i) == A) {
                count++;
            }
        }
        
        System.out.println(count);
        scanner.close();
    }
    
    private static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}