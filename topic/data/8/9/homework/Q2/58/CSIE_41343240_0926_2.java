// file name: CSIE_41343240_0926_2.java
// username&number: 黃榮裕41343240
// function：顯示旋轉棒子與進度
public class CSIE_41343240_0926_2 {
    public static void main(String[] args) throws Exception {
        char[] spinner = { '|', '/', '-', '\\' };
        int progress = 0;

        while (progress <= 100) {
            for (int i = 0; i < spinner.length; i++) {
                System.out.print("\r" + spinner[i] + " " + progress + "%");
                Thread.sleep(100);
                progress++;
                if (progress > 100)
                    break;
            }
        }
        System.out.println("\n完成!");
    }
}
