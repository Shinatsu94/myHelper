import java.util.Scanner;

public class CSIE_41343229_1003_3 {
    // 回傳正整數 n 的各位數字總和
    static int digitSum(int n) {
        int s = 0;
        while (n > 0) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();   // 讀入目標數位和
        sc.close();

        int count = 0;
        for (int i = 1; i <= 100000; i++) {   // 1 到 100000（含）
            if (digitSum(i) == A) count++;
        }
        System.out.println(count);
    }
}
