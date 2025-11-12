
//date :2025/10/03
//username&number :黃榮裕41343240
//function :讀入使用者輸入的三個數字，A, B, C，利用三元運算子找出最大值、最小值、中間值 
import java.util.Scanner;

public class CSIE_41343240_1003_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        int B = sc.nextInt();

        int C = sc.nextInt();

        // 最大值
        int max = (A > B ? (A > C ? A : C) : (B > C ? B : C));
        // 最小值
        int min = (A < B ? (A < C ? A : C) : (B < C ? B : C));
        // 中間值
        int mid = (A + B + C) - max - min;

        System.out.println(min);
        System.out.println(mid);
        System.out.println(max);
        sc.close();
    }
}
