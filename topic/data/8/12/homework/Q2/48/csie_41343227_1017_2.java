
import java.util.Scanner;

public class csie_41343227_1017_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (isWellOrdered(number)) {
            System.out.println(number + " is well-ordered number.");
        } else {
            System.out.println(number + " is not well-ordered number.");
        }
    }

    public static boolean isWellOrdered(int num) {
        String s = Integer.toString(num);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) <= s.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }
}
