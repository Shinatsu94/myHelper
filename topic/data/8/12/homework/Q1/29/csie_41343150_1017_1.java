public class csie_41343150_1017_1 {

    public static double cal(int n) {
        double u = 0.0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                u += 1.0 / (2 * i + 1);
            } else {
                u -= 1.0 / (2 * i + 1);
            }
        }
        return u * 4;
    }

    public static void main(String[] args) {
        for (int i = 10000; i <= 100000; i += 10000) {
            double p = cal(i);
            System.out.printf("i = %d, π ≈ %.15f%n", i, p);
        }

        int i = 0;
        while (true) {
            double p = cal(i);
            if (Math.round(p * 100000.0) / 100000.0 == 3.14159) {
                System.out.printf("i = %d, π ≈ %.15f%n", i, p);
                break;
            }
            i++;
        }
    }
}
