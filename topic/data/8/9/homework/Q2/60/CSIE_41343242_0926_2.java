public class CSIE_41343242_0926_2 {
    public static void main(String[] args) throws Exception {
        
        char[] s = {'|', '/', '-', '\\'};

       
        int a = 10;

            for (int j = 10; j <= 100; j += 10) {
            for (int i = 0; i < a; i++) {
                for (char c : s) {
                    System.out.print("\r" + c + "  " + j + "%");
                    Thread.sleep(50);
                }
            }
        }

        System.out.println("\n完成！");
    }
}