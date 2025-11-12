import java.util.Scanner;

public class csie_1031_41343214_3a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

       
        do {

            n = sc.nextInt();
        } while (n <= 0 || n > 20);

     
        char[][] tri = new char[n][n];

      
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    tri[i][j] = '*';
                } else {
                    tri[i][j] = ' ';
                }
            }
        }

   

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(tri[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
