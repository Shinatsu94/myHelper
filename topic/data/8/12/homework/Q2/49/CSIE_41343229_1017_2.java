import java.util.Scanner;

public class CSIE_41343229_1017_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = String.valueOf(num);
        boolean wellOrdered = true;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) >= str.charAt(i + 1)) { // 如果前一位 >= 下一位
                wellOrdered = false;
                break;
            }
        }

        if (wellOrdered) {
            System.out.printf("%d is well-ordered number.\n", num);
        } else {
            System.out.printf("%d is not well-ordered number.\n", num);
        }

        sc.close();
    }
}

