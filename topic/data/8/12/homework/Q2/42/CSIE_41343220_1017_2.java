import java.util.Scanner;

public class CSIE_41343220_1017_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int save = input;

        int prev = 10; // 設定一個初始值比任何數字都大（因為從右往左拆）
        boolean isWellOrdered = true;

        while (input > 0) {
            int curr = input % 10;

            if (curr >= prev) {
                isWellOrdered = false;
                break;
            }

            prev = curr;
            input /= 10;
        }

        if (isWellOrdered) {
            System.out.println(save + " is well-ordered number.");
        } else {
            System.out.println(save + " is not well-ordered number.");
        }
    }
}
