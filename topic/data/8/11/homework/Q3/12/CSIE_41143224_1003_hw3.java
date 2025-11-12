import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();

        if (A < 1 || A > 45) {

            scanner.close();
            return;
        }
        
        int count = 0; 
        
        for (int i = 1; i <= 100000; i++) {
            int sum = 0;
            int num = i;
            while (num > 0) {
                sum += num % 10; 
                num /= 10;       
            }
            if (sum == A) {
                count++;
            }
        }
        
        
        System.out.printf("%d\n", count);
        
        scanner.close();
    }
}