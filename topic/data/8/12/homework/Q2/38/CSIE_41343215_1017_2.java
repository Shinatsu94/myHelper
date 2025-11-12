import java.util.Scanner;
public class CSIE_41343215_1017_2 {
    public static boolean isWellOrdered(String numberStr) {
        for (int i = 0; i < numberStr.length() - 1; i++) if (numberStr.charAt(i) >= numberStr.charAt(i + 1)) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        if (isWellOrdered(userInput)) System.out.println(userInput + " is well-ordered number.");
        else System.out.println(userInput + " is not well-ordered number.");
        scanner.close();
    }
}