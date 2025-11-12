import java.util.Scanner;

public class  csie_41343242_1017_2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        String numStr = String.valueOf(number);
        boolean isWellOrdered = true;

        for (int i = 0; i < numStr.length() - 1; i++) {
            if (numStr.charAt(i) >= numStr.charAt(i + 1)) {
                isWellOrdered = false;
                break;
            }
        }

        if (isWellOrdered) {
            System.out.println(number + " is well-ordered number.");
        } else {
            System.out.println(number + " is not well-ordered number.");
        }
    }
}

