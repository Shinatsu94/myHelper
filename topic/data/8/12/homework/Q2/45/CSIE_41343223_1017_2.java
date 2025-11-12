
import java.util.*;

public class WellOrderedNumber {
    public static boolean isWellOrdered(long x) {
        x = Math.abs(x);
        if (x < 10) return true; // 一位數

        long prev = x % 10;      // 從最右邊開始取
        x /= 10;
        while (x > 0) {
            long cur = x % 10;   // cur 在左、prev 在右
            if (!(cur < prev)) { // 必須嚴格遞增：左 < 右
                return false;
            }
            prev = cur;
            x /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.print("請輸入一個整數：");
        long n = sc.nextLong();
        if (isWellOrdered(n)) {
            System.out.println(n + " is well-ordered number.");
        } else {
            System.out.println(n + " is not well-ordered number.");
        }
        sc.close();
    }
}
