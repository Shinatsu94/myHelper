
// file name: CSIE_41343240_0926_3.java
// username&number: 黃榮裕41343240
// function：輸入分數，判斷及格 / 補考 / 不及格
import java.util.Scanner;

public class CSIE_41343240_0926_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("請輸入 3 個分數：");

        // 固定讀取 3 筆輸入
        for (int i = 0; i < 3; i++) {
            int score = sc.nextInt();

            if (score >= 60) {
                System.out.println("及格");
            } else if (score >= 50) {
                System.out.println("補考");
            } else {
                System.out.println("不及格");
            }
        }

        sc.close();
    }
}
