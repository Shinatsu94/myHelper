import java.util.Scanner;

public class csie_41343150_1017_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 找最高位的除數（div）
        int div = 1;
        while (n / div >= 10) {
            div *= 10;
        }

        int prev = -1;
        boolean ok = true;

        while (div > 0) {
            int curr = (n / div) % 10;  // 取當前位數字
            if (curr <= prev) {
                ok = false;
                break;
            }
            prev = curr;
            div /= 10;
        }

        if (ok) System.out.println("Well-ordered");
        else System.out.println("Not well-ordered");
    }
}
