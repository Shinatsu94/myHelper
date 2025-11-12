public class CSIE_41343220_1017_1 {
    public static void main(String[] args) {
        double pi = 0;
        int nextPrint = 10000;

        // (a) i = 1 ~ 100000
        for (int i = 1; i <= 100000; i++) {
            if (i % 2 == 1) {
                pi += 1.0 / (2 * i - 1);
            } else {
                pi -= 1.0 / (2 * i - 1);
            }

            if (i == nextPrint) {
                System.out.printf("i = %06d, pi = %.10f%n", i, pi * 4);
                nextPrint += 10000;
            }
        }

        System.out.println();

        // (b) 從 100001 開始找最小 i，使 pi * 4 >= 3.14159
        pi = 0;
        int i = 1;

        while (true) {
            if (i % 2 == 1) {
                pi += 1.0 / (2 * i - 1);
            } else {
                pi -= 1.0 / (2 * i - 1);
            }

            if (i >= 100000 && pi * 4 >= 3.14159) {
                System.out.printf("i = %06d, pi = %.10f%n", i, pi * 4);
                break;
            }
            i++;
        }
    }
}
