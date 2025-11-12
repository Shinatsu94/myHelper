import java.util.Scanner;

public class CSIE_11434102_0926_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入分數：");
        int score = scanner.nextInt();

        if (score < 0) {
            System.out.println("分數不能為負數！");
        } else if (score >= 60) {
            System.out.println("及格");
        } else if (score >= 40) {
            System.out.println("補考");
        } else {
            System.out.println("不及格");
        }

        scanner.close();
    }
}