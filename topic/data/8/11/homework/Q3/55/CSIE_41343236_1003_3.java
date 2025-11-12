import java.util.Scanner;

public class CSIE_41343236_1003_3 {
    
// 計算一個數字的每位數字總和
    public static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;  // 取出個位數
            num /= 10;        // 去掉最後一位
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        
        int count = 0;
        // 從 1 到 100000 逐一檢查
        for (int i = 1; i <= 100000; i++) {
            if (digitSum(i) == A) {
                count++;
            }
        }

        System.out.println(count);
    }
}
