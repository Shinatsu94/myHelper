public class CSIE_51015105_0926_2 {
    public static void main(String[] args) throws Exception {
        char[] spinner = {'|', '/', '-', '\\'}; // 旋轉的棒子
        int progress = 0;

        while (progress <= 100) {
            for (char c : spinner) {
                System.out.print("\r" + c + " " + progress + "%"); // \r 回到行首覆蓋
                Thread.sleep(100); // 延遲 0.1 秒
            }
            progress++;
        }
        System.out.println("\n完成!");
    }
}