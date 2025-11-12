public class CSIE_51015120_0926_2 {
    public static void main(String[] args) throws Exception {
        int progress = 0;
        while (progress <= 100) {
            int mod = progress % 4;  // 判斷目前該印哪個符號
            char c = '|';
            if (mod == 1) {
                c = '/';
            } else if (mod == 2) {
                c = '-';
            } else if (mod == 3) {
                c = '\\';
            }
            System.out.print("\r" + c + " " + progress + "%");
            Thread.sleep(100);
            progress++;
        }
        System.out.println("\n完成!");
    }
}
