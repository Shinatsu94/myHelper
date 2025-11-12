import java.util.Scanner;

public class csie_41343235_1003_3 {
    public static void main(String[] args) {
        int B = 0, sum, d;

        Scanner sc = new Scanner(System.in);
        d = sc.nextInt();

        for (int i = 1; i <= 100000; i++) {
            int num = i;
            sum = 0;

            // 將數字 i 的每一位數加總起來
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            if (sum == d)
                B++;
        }

        System.out.println(B);
    }
}
