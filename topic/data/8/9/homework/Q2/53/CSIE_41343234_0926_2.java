public class CSIE_41343234_0926_2 {
    public static void main(String[] args) throws Exception {
        
        char[] spinner = {'|', '/', '-', '\\'};

        int a = 2000; 

        int b = 100;

        int c = a / b;
       
        for (int t = 5; t <= 100; t += 5) {
            for (int i = 0; i < c; i++) { 
                char spinnerChar = spinner[i % spinner.length];
                System.out.print("\r" + spinnerChar + "  " + t + "%");
                Thread.sleep(b);
            }
        }

        System.out.println("\n完成了！");
    }
}
