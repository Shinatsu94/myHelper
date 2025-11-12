public class CSIE_41343137_0926_2 {
    public static void main(String[] args) throws Exception {
        
        char[] s = {'|', '/', '-', '\\'};

       
        int zz = 10;

            for (int j = 10; j <= 100; j += 5) {
            for (int i = 0; i < zz; i++) {
                for (char c : s) {
                    System.out.print("\r" + c + "  " + j + "%");
                    Thread.sleep(50);
                }
            }
        }

        System.out.println("\n完成！");
    }
}