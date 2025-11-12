import java.util.Scanner;

public class CSIE_41343223_1003_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 讀入目標數字 A
       // System.out.print("請輸入一個目標數字 A（0 ~ 54）: ");
        int A = scanner.nextInt();

        // 檢查 A 合理性（最大值 99999 -> 位數和最大是 9*5=45，但 100000 有 6 位數 => 最大 54）
        if (A < 0 || A > 54) {
          //  System.out.println("請輸入一個在 0 到 54 之間的整數。");
            return;
        }

        int count = 0;

        // 從 1 到 100000 檢查
        for (int i = 1; i <= 100000; i++) {
            int sum = digitSum(i);
            if (sum == A) {
                count++;
	//System.out.println(i);
            }
        }

        // 輸出符合條件的數字數量
        //System.out.println("1 到 100000 之間，各位數字加總為 " + A + " 的數字總共有: " + count + " 個");
    	System.out.println(count);
	}

    // 回傳一個數字的各位數字加總
    public static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;  // 取出個位數
            num /= 10;        // 去掉個位數
        }
        return sum;
    }
}
