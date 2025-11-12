import java.util.Scanner;

public class LowerTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            n = sc.nextInt();  // 讀入高度
        } while (n <= 0 || n > 20);

        // 直接印下三角形
        for (int i = 1; i <= n; i++) {       // 每行
            for (int j = 0; j < i; j++) {    // 每行印 i 個 '*'
                System.out.print("*");
            }
            System.out.println();             // 換行
        }

        sc.close();
    }
}
