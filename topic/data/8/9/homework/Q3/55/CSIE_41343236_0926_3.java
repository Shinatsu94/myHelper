import java.util.Scanner;

public class CSIE_41343236_0926_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入成績：");
        int score = sc.nextInt();

        if (score == 100) {
            System.out.println("滿分");
        } else if (score >= 60) {
            System.out.println("及格");
        } else if (score >= 0) {
            System.out.println("不及格");
        } else {
            System.out.println("輸入錯誤，請輸入 0-100 的成績");
        }

        sc.close();
    }
}

