import java.util.Scanner;

public class CSIE_41343236_1017_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(); // 讀取使用者輸入的整數

        int reversed = 0;
        int n = Math.abs(num); // 取絕對值，方便處理

        // 逐位反轉
        while (n > 0) {
            int digit = n % 10;         // 取出最後一位
            reversed = reversed * 10 + digit; // 加到反轉結果中
            n /= 10;                    // 去掉剛剛取出的那一位
        }

        // 若原數為負，結果也要是負的
        if (num < 0) {
            reversed = -reversed;
        }

        System.out.println(reversed); // 輸出反轉後的結果

        scanner.close();
    }
}
