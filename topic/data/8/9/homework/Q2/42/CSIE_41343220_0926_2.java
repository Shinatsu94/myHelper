

public class CSIE_41343220_0926_2 {
    public static void main(String[] args) throws InterruptedException {
        char[] spinner = {'/', '-', '\\'};
        int count = 0;

        while (count != 100) {
            for (char c : spinner) {
                System.out.print("\033[H\033[2J");
                System.out.flush();

                System.out.println(c + " " + count + "%");
                Thread.sleep(100);
            }
            count++;
        }

        System.out.println("完成 100%!");
    }
}
