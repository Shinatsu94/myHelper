import java.util.Scanner;

public class CSIE_41343208_1031_3a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 印出下三角形
        for (int i = 0; i < n; i++) {        // i 為列
            for (int j = 0; j <= i; j++) {   // j 為行
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
