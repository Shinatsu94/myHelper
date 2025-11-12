public class CSIE_41343233_1017_1 {
    public static void main(String[] args) {
        for (int i = 10000; i <= 100000; i += 10000) {
            double sum = 0.0;
            for (int k = 1; k <= i; k++) {
                // (-1)^(k-1) * 1/(2k-1)
                double term = Math.pow(-1, k - 1) / (2 * k - 1);
                sum += term;
            }
            double pi = 4 * sum;
            System.out.printf("i = %6d, pi = %.10f\n", i, pi);
        }
        int i = 136000,b=314159,a=0;
        double pi=0.0;
        
        while (true) {
            double sum = 0.0;
            for (int k = 1; k <= i; k++) {
                double term = Math.pow(-1, k - 1) / (2 * k - 1);
                sum += term;
            }
            pi = 4 * sum;
            i++;
            a=(int)(pi*100000);
            if(a==b) break;
        }

        System.out.printf("\ni = %6d", i - 1);
    }
}
