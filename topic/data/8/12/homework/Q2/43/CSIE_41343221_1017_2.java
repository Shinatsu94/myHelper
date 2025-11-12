import java.util.Scanner;

public class CSIE_41343221_1017_2 {

    public static boolean isWellOrdered(int number) {
        String numStr = Integer.toString(number);

        for (int i = 0; i < numStr.length() - 1; i++) {
            if (numStr.charAt(i) >= numStr.charAt(i + 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int number = Integer.parseInt(input); 
        if (isWellOrdered(number)) {
            System.out.println(number + " is well-ordered number.");
        } else {
            System.out.println(number + " is not well-ordered number.");
        }

        scanner.close();
    }
}
