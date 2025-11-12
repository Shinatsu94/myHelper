import java.util.Scanner;
public class CSIE_41343232_1031_3a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) System.out.print("*");
            System.out.println();
        }
        in.close();
    }
}
