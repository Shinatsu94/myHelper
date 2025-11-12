import java.util.Scanner;

public class LowerTriStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 讀入 n（建議輸入時只給一個整數，避免多餘提示字影響自動評測）
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        // 邊界檢查：0 < n <= 20
        if (n <= 0 || n > 20) return;

        // 列印下三角形：第 i 列印 i 個 '*'
        for (int i = 1; i <= n; i++) {
            // 不需要前置空白（左下直角）
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
