public class ex3 {
    public static void main(String[] args) {
        for (int i = 2; i < 10000; i += 2) {
            
            double a = 4 * ((-1.0 / (2 * i - 1)) + (1.0 / (2 * i + 1)));
            System.out.print("pi=" + a + "\n");
        }
    }
}

