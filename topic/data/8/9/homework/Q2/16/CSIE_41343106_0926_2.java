public class Main {
    public static void main(String[] args) throws Exception {
        String[] rotation = { "|", "/", "-", "\\" };  
        int progress = 10;  
        while (progress <= 100) {  
            for (String direction : rotation) {
                System.out.print("\r" + direction + " 進度: " + progress + "%");
                Thread.sleep(100);
                progress += 10;
                if (progress > 100) {
                    progress = 100; 
                }
            }
        }
        System.out.println("\n進度已達 100%，完成！");
    }
}
