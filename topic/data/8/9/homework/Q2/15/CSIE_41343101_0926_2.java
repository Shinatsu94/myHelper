public class CSIE_41343101_0926_2 {
    public static void main(String[] args) {
        System.out.println("\nLoading..."); 

        String[] spinner = {"|", "/", "-", "\\"}; 
        int total = 50; 
         
        for (int i = 0; i <= total; i++) {
            int percent = i * 100 / total; 
            int progressLength = 30;
            int filled = i * progressLength / total; 

            String bar = "[" + "#".repeat(filled) + " ".repeat(progressLength - filled) + "]";

            String spinnerChar = spinner[i % spinner.length];

            System.out.printf("\r%s %s %3d%%", spinnerChar, bar, percent);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("\n完成!");
    }
}