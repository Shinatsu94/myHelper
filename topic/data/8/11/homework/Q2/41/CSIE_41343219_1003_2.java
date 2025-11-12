import java.util.Scanner;

public class CSIE_41343219_1003_2 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt(); b = sc.nextInt(); c = sc.nextInt();
        sc.close();
        int max = a > b ? a > c ? a : c : b > c ? b : c;
        int min = a < b ? a < c ? a : c : b < c ? b : c;
        int mid = (
            (a > b && b > c) || (c > b && b > a)
        ) ? b : (
            (a > c  && c > b) || (b > c && c > a)
        )   ? c : a;
        System.out.println(min);
        System.out.println(mid);
        System.out.println(max);
    }
}
