import java.util.Scanner;

public class CSIE_51015120_1031_3a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n = sc.nextInt();
        } while (n <= 0 || n > 20);
        char[][] matrix = new char[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                matrix[i][j] = ' ';
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                matrix[i][j] = '*';
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(matrix[i][j]);
            }
            if (i != n) 
                System.out.println();
        }

        sc.close();
    }
}

