import java.util.Scanner;
public class CSIE_41343215_0926_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            if (x >= 60)System.out.println("及格");
            else if (x >= 50)System.out.println("補考");
            else System.out.println("不及格");
        }
        scanner.close();
    }
}