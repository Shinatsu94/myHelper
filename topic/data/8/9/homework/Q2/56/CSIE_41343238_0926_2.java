public class ch31{
    public static void main(String[] args)  throws Exception{
        char[] spinner = {'|', '/', '-', '\\'};
        int progress = 0;

        while (progress <= 100) {
            for (int i = 0; i < spinner.length; i++) {
                // 使用 \r 將游標移回行首，以便覆蓋上一行
                System.out.print("\r" + spinner[i] + " " + progress + "%");
                Thread.sleep(100); // 暫停 100 毫秒

                // 每 4 個旋轉符號（大約 400ms）更新一次進度
                if (i == spinner.length - 1) {
                    progress += 2; // 每次進度 +2，可依需求調整
                }
            }
        }

        // 印出完成訊息
        System.out.println("\r 100% Done!");
    }
}
