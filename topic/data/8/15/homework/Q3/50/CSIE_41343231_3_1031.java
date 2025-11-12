import java.util.Scanner;

public class PrintStar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // 輸入高度
        
        if (n > 0 && n <= 20) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        
        s.close();
    }
}
