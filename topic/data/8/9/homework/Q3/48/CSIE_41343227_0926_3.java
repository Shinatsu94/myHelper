import java.util.Scanner;

public class CSIE_41343227_0926_3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int score = scanner.nextInt();

            if (score >= 60) {
                System.out.println("及格");
            } else if (score >= 50) {
                System.out.println("補考");
            } else {
                System.out.println("不及格");
            }
        }

        scanner.close();
    }
}
