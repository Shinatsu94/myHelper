public class csie_41343239_1017_1 {
    public static void main(String[] args) {
        double pi = 0.0;
        double term;
        int i = 1;
        double t = 0.0;
        boolean found = false;
        int lastPrinted = 0;

        while (true) {
            // Leibniz 公式累加每一項
            if (i % 2 != 0)
                term = 1.0 / (2 * i - 1);
            else
                term = -1.0 / (2 * i - 1);

            t += term;
            pi = 4 * t;

            // 每 10000 項輸出一次
            if (i % 10000 == 0 && i != lastPrinted) {
                System.out.printf("i = %6d, pi = %.10f\n", i, pi);
                lastPrinted = i;
            }

            // 找到最小 i 使 pi ≈ 3.14159（小數點前5位精度）
            if (!found && Math.abs(pi - 3.14159) < 0.000005) {
                System.out.printf("\ni = %d, pi = %.10f\n", i, pi);
                found = true;
                break; // 找到後停止程式
            }

            i++;
        }
    }
}
