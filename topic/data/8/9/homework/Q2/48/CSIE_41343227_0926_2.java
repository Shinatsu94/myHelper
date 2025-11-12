public class CSIE_41343227_0926_2{
    public static void main(String[] args) throws Exception {
        char[] spinner = {'|', '/', '-', '\\'};
        int progress = 0;
        int index = 0;

        while (progress <= 100) {
            System.out.print("\r" + spinner[index] + " " + progress + "%");

            Thread.sleep(1000);            index = (index + 1) % spinner.length;
            progress++;
        }

        System.out.println("\nDone!");
    }
}
