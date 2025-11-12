import java.util.*;
 
public class csie_41343137_1031_3_1 {
 public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.print("");
        int n = sc.nextInt();

        if (n <= 0 || n > 20) {
            System.out.println("error，要在1~20之間");
            return;
        }

        char[][] t = new char[n][n];

            for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                t[i][j] = '*';
            }
        }

                for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(t[i][j]);
            }
            System.out.println();
        }
    }
}
