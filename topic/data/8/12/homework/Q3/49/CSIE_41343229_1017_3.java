import java.util.Scanner;

public class CSIE_41343229_1017_3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long n = sc.nextLong();        // 讀入整數（用 long 比較安全）
            if (n == 0) {                  // 特例：0
                System.out.println(0);
                return;
            }

            long sign = n < 0 ? -1 : 1;    // 保留正負號
            long x = Math.abs(n);
            long rev = 0;

            while (x > 0) {                // 數字反轉
                rev = rev * 10 + (x % 10);
                x /= 10;
            }

            rev *= sign;                   // 還原正負號
            System.out.println(rev);       // 直接輸出反轉結果
        }
    }
}
