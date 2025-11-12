import java.util.Scanner;

class ScoreCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 只要還有整數輸入就繼續讀
        while (sc.hasNextInt()) {
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