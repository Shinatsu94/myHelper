import java.util.Scanner;

public class CSIE_51015105_1003_3 {
    // 回傳 x 的各位數加總
    static int digitSum(int x) {
        int s = 0;
        while (x > 0) {
            s += x % 10;
            x /= 10;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        sc.close();

        // 1..100000 的位數和上限是 45（99999）或 1（100000），超出直接為 0
        if (A < 1 || A > 45) {
            System.out.println(0);
            return;
        }

        int count = 0;
        for (int i = 1; i <= 100000; i++) {
            if (digitSum(i) == A) count++;
        }
        System.out.println(count);
    }
}