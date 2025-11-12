import java.util.*;

public class TriIndexFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 讀入高度 n 與要找的數 num
        if (!sc.hasNextLong()) return;
        long n = sc.nextLong();
        if (!sc.hasNextLong()) return;
        long num = sc.nextLong();

        // 三角形可容納的最大編號
        long total = n * (n + 1) / 2;

        // 超出範圍或不合法
        if (num <= 0 || num > total) {
            System.out.printf("not find %d in array.%n", num);
            return;
        }

        // 計算所在列 r = ceil((sqrt(1+8*num)-1)/2)
        long r = (long) Math.ceil((Math.sqrt(1.0 + 8.0 * num) - 1.0) / 2.0);

        // 行號 c = num - T_{r-1}
        long prev = (r - 1) * r / 2;  // T_{r-1}
        long c = num - prev;

        // 依題目格式輸出：num [row, col]
        System.out.printf("%d[%d, %d]%n", num, r, c);
    }
}
