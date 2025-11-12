public class CSIE_41343150_0926_2 { 

   public static void main(String[] args) {
        bombom();
   }

   public static void bombom() {
        String[] spinner = {"-", "/", "\\", "|"};
        int total = 100;

        for (int i = 0; i <= total; i++) {
            int percent = i * 100 / total;

            String spinnerChar = spinner[i % spinner.length];

            System.out.printf("\r%s %3d%%", spinnerChar, percent);

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("\n結束");
    }
}
