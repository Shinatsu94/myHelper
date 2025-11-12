/* file name: CSIE_41343212_1003_3.java
   student: 李品劭
   ID: 41343212
   function: to find how many numbers have the sum of each digit equal to a
 */

import java.util.Scanner;

public class CSIE_41343212_1003_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int count = 0;
        for (int i = 1; i <= 100000; i++) {
            if (digitSum(i) == a) count++;
        }

        System.out.println(count);
        input.close();
    }

    private static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}