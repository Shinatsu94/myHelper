import java.util.Scanner;

public class CSIE_41343242_0926_3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int s = scanner.nextInt();

            if (s >= 60) {
                System.out.println("及格");
            } else if (s >= 50) {
                System.out.println("補考");
            } else {
                System.out.println("不及格");
            }
        }

        scanner.close();
    }
}