public class CSIE_41343221_1017_1 {
    public static void main(String[] args) {
        int maxCheck = 100000;
        int step = 10000;

        double sum = 0.0;


        for (int i = 1; i <= maxCheck; i++) {
            double term = 1.0 / (2 * i - 1);
            if (i % 2 == 0) {
                sum -= term;
            } else {
                sum += term;
            }

            if (i % step == 0) {
                double pi = 4 * sum;
                System.out.printf("i = %6d, pi = %.10f%n", i, pi);
            }
        }


        System.out.println(" ");


        sum = 0.0;
        int i = 1;
        while (true) {
            double term = 1.0 / (2 * i - 1);
            if (i % 2 == 0) {
                sum -= term;
            } else {
                sum += term;
            }

            double pi = 4 * sum;
            double roundedPi = Math.round(pi * 1_000_000_000_0L) / 1_000_000_000_0.0;

            if (roundedPi == 3.1415999999) {
                System.out.printf("i = %6d, roundedPi);
                break;
            }
            i++;
        }
    }
}
