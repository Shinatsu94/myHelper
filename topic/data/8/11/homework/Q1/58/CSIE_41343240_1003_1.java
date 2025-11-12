
//date :2025/10/03
//username&number :黃榮裕41343240
//function :讀入使用者輸入的二個數字存在變數 A, B 並印出其值，最後再做交換
import java.util.Scanner;

public class CSIE_41343240_1003_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        int B = sc.nextInt();

        // 用加減法交換
        A = A ^ B;
        B = A ^ B;
        A = A ^ B;

        System.out.println(A);
        System.out.println(B);

        sc.close();
    }
}
