import java.util.Scanner;

public class CSIE_41343219_1003_1 {
    public static void main(String[] args) {
        int a, b ;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt(); b = sc.nextInt(); sc.close();
        a = (a = a ^ b) ^ (b = a ^ b);
        System.out.println(a);
        System.out.println(b);
    }
}
