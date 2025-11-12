
//date :2025/10/03
//username&number :黃榮裕41343240
//function :輸入一個數字A, 找尋 1 到 100000之間有多少數字每一個位數的加總結果等於A 
import java.util.Scanner;

public class CSIE_41343240_1003_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        int count = 0;

        // 從 1 到 100000 遍歷
        for (int i = 1; i <= 100000; i++) {
            if (digitSum(i) == A) {
                count++;
            }
        }
        sc.close();
        System.out.println(count);
    }

    // 計算數字各位數字之和
    public static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
