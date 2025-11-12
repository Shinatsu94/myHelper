import java.util.Scanner;

public class CSIE_41343217_1003_3 {
    
    public static int sumDigits(int number) {
        int sum = 0;
        int temp = number; 

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N;
        N = scanner.nextInt();
        
        int count = 0;
        
        for (int i = 1; i <= 100000; i++) {
            int digitSum = sumDigits(i);
            
            if (digitSum == N) {
                count++;
            }
        }
        System.out.println(count);
        
        scanner.close();
    }
}