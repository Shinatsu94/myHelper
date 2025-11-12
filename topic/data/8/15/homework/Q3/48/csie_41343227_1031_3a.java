import java.util.*;

public class CSIE_41343227_1031_3a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 輸入高度

        char[][] arr = new char[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                arr[i][j] = '*';
            }
        }

      
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
