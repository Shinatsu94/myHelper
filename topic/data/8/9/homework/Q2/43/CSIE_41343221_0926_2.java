public class CSIE_41343221_0926_2 {

    public static void main(String[] args) {
        char[] a = {'-', '\\', '|', '/'};

        System.out.println("程式開始運行...");

        for (int c = 0; c <= 100; c++) {
            
            char d = a[c % a.length];
            
            String e = String.format("%c %d%%", d, c);
            
            System.out.print("\r" + e);
            
            System.out.flush();

            try {
                Thread.sleep(100);
            } catch (InterruptedException f) {
                return; 
            }
        }
    }
}