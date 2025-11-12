import java.util.Scanner;

public class CSIE_41243247_1003_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("請輸入三個數字 A B C: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        // 最大值
        int max = (x > y ? (x > z ? x : z) : (y > z ? y : z));
        // 最小值
        int min = (x < y ? (x < z ? x : z) : (y < z ? y : z));
        // 中間值 = 總和 - 最大 - 最小
        int mid = (x + y + z) - max - min;

        System.out.println("最大值 max = " + max);
        System.out.println("最小值 min = " + min);
        System.out.println("中間值 mid = " + mid);

        sc.close();
    }
}
