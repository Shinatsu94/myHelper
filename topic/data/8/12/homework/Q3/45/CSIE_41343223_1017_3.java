import java.util.*;

public class ReverseInteger {
    public static long reverse(long x) {
        boolean neg = x < 0;
        long t = Math.abs(x);
        long rev = 0;
        while (t > 0) {
            long d = t % 10;     // 取尾數
            rev = rev * 10 + d;  // 放到新數字尾端
            t /= 10;
        }
        return neg ? -rev : rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // System.out.print("請輸入一個整數：");
        long n = sc.nextLong();
        long r = reverse(n);
        System.out.println(r);
        sc.close();
    }
}
