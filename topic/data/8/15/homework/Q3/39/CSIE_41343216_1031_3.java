import java.util.Scanner;

public class CSIE_41343216_1031_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 讀入高度
        sc.close();

        // 產生下三角形
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // 換行
        }
    }
}
