public class CSIE_41343212_1017_1 {
    public static void main(String[] args) {
        double pi;
        double sum = 0;
        for (int i = 1; i <= 100000; i++) {
            if (i % 2 == 1) sum = sum + (double) 1 / (2 * i - 1);
            else sum = sum - (double) 1 / (2 * i - 1);
            pi = 4 * sum;
            if (i % 10000 == 0)
                System.out.println("i = " + String.format("%6d", i) + ", pi = " + String.format("%.10f", pi));
        }

        System.out.println();
        for (int i = 100001; i <= 1000000; i++) {
            if (i % 2 == 1) sum = sum + (double) 1 / (2 * i - 1);
            else sum = sum - (double) 1 / (2 * i - 1);
            pi = 4 * sum;
            String pi_str = String.format("%.5f", pi);
            if (pi_str.equals("3.14159")) {
                System.out.print(i);
                return;
            }
        }
    }
}