
//date:2025/10/17
//funtion:反轉輸入的數字
//name&number:黃榮裕41343240
import java.util.Scanner;

public class CSIE_41343240_1017_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("請輸入一個整數：");
        int n = sc.nextInt();

        int reversed = reverseNumber(n);

        System.out.println(reversed);

        sc.close();
    }

    public static int reverseNumber(int n) {
        int reversed = 0;
        int sign = n < 0 ? -1 : 1; // 處理負數
        n = Math.abs(n);

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        return reversed * sign;
    }
}
