/**
     * 作者：彭裕軒
     * 程式目的：印出一個旋轉的棒子
     * 日期：2025-09-26 
     */
public class csie_51015114_0926_02 {
    public static void main(String[] args) throws Exception {
        int step = 0;
	char[] rotate = {'|', '/', '-', '\\'};
        while (step <= 100) {
            for (char c : rotate) {
                System.out.print("\r" + c + " " + step + "%");
                Thread.sleep(100); 
            }
            step++;
        }
        System.out.println("\n完成!");
    }
}