import java.util.Scanner;

public class CSIE_41343208_0926_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入成績 (0~100): ");
        int score = scanner.nextInt();

        if (score >= 60) {
            System.out.println("成績 " + score + " 分 → 及格");
        } else {
            System.out.println("成績 " + score + " 分 → 不及格");
        }

        scanner.close();
    }
}
