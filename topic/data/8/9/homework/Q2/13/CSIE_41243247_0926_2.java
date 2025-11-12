public class CSIE_41243247_0926_2 {
    public static void main(String[] args) throws Exception {
        char[] spinner = {'|', '/', '-', '\\'};
        int index = 0;

        for (int percent = 0; percent <= 100; percent += 10) {
            System.out.print("\r" + spinner[index] + " " + percent + "%");
            index = (index + 1) % spinner.length;
            Thread.sleep(200); // 每 0.2 秒更新
        }

        System.out.println("\n完成!");
    }
}
