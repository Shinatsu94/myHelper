public class CSIE_41343143_0926_2 {
    public static void main(String[] args) throws Exception {
        char[] spinner = {'|', '/', '-', '\\'};
	int total = 100;
        for (int i = 1; i <= total; i++) {
            char spinChar = spinner[i % spinner.length];
            System.out.print("\r" + spinChar + " " + i + "%");
            Thread.sleep(100);
        }

        System.out.println("\n載入完成！");
    }
}
