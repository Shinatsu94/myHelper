import java.util.Scanner;
public class CSIE_41343238_1017_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 輸入想要的精度，例如 1e-5；或輸入最大項數作為保險(例如 1_000_000)
        double tol = scanner.nextDouble();   // 推薦輸入 1e-5
        int maxCap = 1_000_000;              // 安全上限，避免無限跑

        double sum = 0.0;
        int i = 0;
        while (i < maxCap) {
            i++;
            sum += ((i % 2 == 1) ? 1.0 : -1.0) / (2 * i - 1);

            // 每 10000 項展示一次進度（可選）
            if (i % 10000 == 0) {
                System.out.printf("i = %6d, pi = %.10f%n", i, 4 * sum);
            }

            // 利用下一項作為誤差上界：對 π 而言誤差 ≤ 4/(2i+1)
            if (4.0 / (2 * i + 1) < tol) break;
        }

        System.out.printf("Final: i = %d, pi = %.10f (tol=%g)%n", i, 4 * sum, tol);
    }
    	System.out.printf("i = 136121");
}
