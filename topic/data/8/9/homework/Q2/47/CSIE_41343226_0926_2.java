public class CSIE_41343226_0926_2 {
    public static void main(String[] args) throws Exception {
        int n = 100;
        for (int i = 0; i <= n; i++) {
            System.out.print("\r");
            int p = i;
            int l = 40;
            int f = (p * l) / 100;
            System.out.print("進度: [");
            for (int j = 0; j < l; j++) {
                if (j < f) {
                    System.out.print("█");
                } else {
                    System.out.print("░");
                }
            }
            System.out.printf("] %d%% (%d/%d)", p, i, n);
            System.out.flush();
            Thread.sleep(50);
        }
        System.out.println("\nＯＫ!");
    }
}