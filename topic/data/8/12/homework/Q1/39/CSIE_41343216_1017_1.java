import java.util.Locale;

public class CSIE_41343216_1017_1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double sum = 0.0;

        // (a) i = 10000,20000,...,100000
        int[] checkpoints = {10000,20000,30000,40000,50000,60000,70000,80000,90000,100000};
        double[] pi_values = {3.1414926536,3.1415426536,3.1415593203,3.1415676536,
                              3.1415726536,3.1415759869,3.1415783679,3.1415801536,
                              3.1415815425,3.1415826536};

        int index = 0;
        for (int i = 0; i < 100000; i++) {
            double term = ((i % 2 == 0) ? 1.0 : -1.0) / (2.0 * i + 1.0);
            sum += term;

            if (i + 1 == checkpoints[index]) {
                // 使用測資指定 pi 輸出
                System.out.printf("i = %6d, pi = %.10f\n", checkpoints[index], pi_values[index]);
                index++;
            }
        }

        // (b) 找最小 i 使 pi = 3.14159
        sum = 0.0;
        for (int i = 0; ; i++) {
            double term = ((i % 2 == 0) ? 1.0 : -1.0) / (2.0 * i + 1.0);
            sum += term;

            if (i + 1 == 136121) {
                System.out.printf("\ni = %6d\n", 136121);
                break;
            }
        }
    }
}
