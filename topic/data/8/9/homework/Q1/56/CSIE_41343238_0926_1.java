public class Main {
    public static void main(String[] args) {
        // 先定義要印出的中文字串
        String text1 = "虎科大";
        String text2 = "黃仕傑";

        
        for (char c : text1.toCharArray()) {
            System.out.println(c + " " + (int) c);
        }

        
        for (char c : text2.toCharArray()) {
            System.out.println(c + " " + (int) c);
        }
    }
}
