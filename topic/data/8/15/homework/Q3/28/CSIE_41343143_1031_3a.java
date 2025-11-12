import java.util.Scanner;
public class CSIE_41343143_1031_3a{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n <= 0 || n > 20) {
            System.out.println("wrong");
            return;
        }
        char[][] triangle = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = '*';
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j]);
            }
            System.out.println(); 
        }
    }
}
