import java.util.Scanner;

public class CSIE_41243247_1003_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("請輸入兩個數字 A B: ");
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println("交換前: A = " + A + ", B = " + B);

        // 不可使用額外變數 → 用加減法交換
        A = A + B;  
        B = A - B;  
        A = A - B;

        System.out.println("交換後: A = " + A + ", B = " + B);

        sc.close();
    }
}
