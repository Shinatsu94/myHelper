import java.util.Scanner;

public class csie_41343239_1017_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int n = c;

        int s1 = n % 10;
        n /= 10;
        int s2 = n % 10;
        n /= 10;
        int s3 = n % 10;

        if (s3 < s2 && s2 < s1) {
            System.out.printf("%d is well-ordered number.\n", c);
        } else {
            System.out.printf("%d is not well-ordered number.\n", c);
        }

        sc.close();
    }
}
