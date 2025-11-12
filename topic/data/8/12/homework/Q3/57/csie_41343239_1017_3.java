import java.util.Scanner;

public class csie_41343239_1017_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;  // 取最後一位
            reversed = reversed * 10 + digit;  // 反轉累加
            n /= 10;  // 去掉最後一位
        }

        System.out.println(reversed);
        sc.close();
    }
}

