class CSIE_51015114_1017_2 {
    public static void main(String[] args) {
        double pi = 0;
        int terms = 0;
        for (int cnt = 10000; cnt <= 100000; cnt += 10000) {
            pi = 0;
            for (int i = 0; i < cnt; i++) {
                double term = 1.0 / (2 * i + 1);
                pi += (i % 2 == 0) ? term : -term;
            }
            System.out.printf("i = %6d, pi = %.10f\n", cnt, 4 * pi);
        }
        pi = 0;
        long target = 314159; // 3.14159 * 100000
        for (int i = 0; i <= 10000000; i++) {
            double term = 1.0 / (2 * i + 1);
            pi += (i % 2 == 0) ? term : -term;
            long truncated = (long)(4 * pi * 100000); 
            if (truncated == target) {
                System.out.printf("\ni = %6d\n", i + 1);
                break;
            }
        }
    }
}
