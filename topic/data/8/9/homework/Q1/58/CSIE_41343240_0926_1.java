// file name: PrintNameCode.java
// username&number: 黃榮裕41343240
// function：印出虎科大與姓名每一字及其 Unicode 內碼
public class CSIE_41343240_0926_1 {
    public static void main(String[] args) {
        // 學校 + 姓名 (請改成你自己的名字)
        String text = "虎科大黃榮裕";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int code = (int) c; // Unicode 內碼
            System.out.println(c + " " + code);
        }
    }
}
