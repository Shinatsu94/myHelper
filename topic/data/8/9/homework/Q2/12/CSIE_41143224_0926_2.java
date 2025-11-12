public class SpinnerAnimation {
    private static final char[] SPINNER = {'|', '/', '-', '\\'};
    private static volatile int progress = 0;
    private static volatile boolean running = true;

    public static void main(String[] args) {
        Thread spinner = new Thread(() -> {
            int i = 0;
            while (running) {
                System.out.printf("\r進度: %c %d%%", SPINNER[i++ % SPINNER.length], progress);
                try { Thread.sleep(100); } catch (InterruptedException e) { break; }
            }
        });

        Thread progressThread = new Thread(() -> {
            while (progress < 100) {
                try { Thread.sleep(200); progress++; } catch (InterruptedException e) { break; }
            }
            running = false;
            System.out.printf("\rCompleted! 100%%\n");
        });

        spinner.start();
        progressThread.start();
        try { spinner.join(); progressThread.join(); } catch (InterruptedException e) {}
    }
}
