import java.util.Scanner;

public class CSIE_41243247_1003_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("請輸入數字 A: ");
        int A = sc.nextInt();

        int count = 0; // 符合的數字數量

        System.out.println("符合條件的數字有：");
        for (int i = 1; i <= 100000; i++) {
            if (digitSum(i) == A) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\n在 1 到 100000 之間，位數和等於 " + A + " 的數字共有 " + count + " 個");

        sc.close();
    }

    // 計算數字每一位的總和
    private static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10; // 取出個位數
            n /= 10;       // 去掉最後一位
        }
        return sum;
    }
}
