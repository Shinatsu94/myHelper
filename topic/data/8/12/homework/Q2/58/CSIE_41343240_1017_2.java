
// date:2025/10/17
// function: 判斷使用者輸入的數字是否為 well-ordered number
// name&number: 黃榮裕41343240
import java.util.Scanner;

public class CSIE_41343240_1017_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); // 讀取單一輸入

        if (isWellOrdered(num)) {
            System.out.println(num + " is well-ordered number.");
        } else {
            System.out.println(num + " is not well-ordered number.");
        }

        sc.close();
    }

    // 判斷是否為 well-ordered number（嚴格遞增）
    public static boolean isWellOrdered(int n) {
        String s = String.valueOf(n);
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) >= s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
