import java.util.Scanner;
public class CSIE_41343229_1031_3  {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt(); 
            char[][] tri = new char[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    tri[i][j] = '*';
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(tri[i][j]);
                }
                System.out.println();
            }
        }
    }
}
