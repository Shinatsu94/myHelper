import java.util.Scanner;

public class CSIE_41343238_1017_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();   // 讀一行
        boolean ok = s.length() > 0;

        // 也可加這段確保每個字都是數字：
        for (int i = 0; ok && i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) { ok = false; }
        }

        // 嚴格遞增檢查
        for (int i = 1; ok && i < s.length(); i++) {
            if (!(s.charAt(i - 1) < s.charAt(i))) {
                ok = false;
            }
        }

        if (ok) System.out.println(s + " is well-ordered number.");
        else    System.out.println(s + " is not well-ordered number.");
    }
}
