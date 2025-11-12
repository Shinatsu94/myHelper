import java.util.Scanner;

public class CSIE_41343212_1031_3a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n > 0 && n <= 20) {
            char [][] tri = new char[n][];
            for (int i = 0; i < n; i++) {
                tri[i] = new char[i + 1];
                for (int j = 0; j <= i; j++) tri[i][j] = '*';

            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) System.out.print(tri[i][j]);

                System.out.println();
            }

        }

        else System.out.println("invalid input.");
        input.close();
    }
}
