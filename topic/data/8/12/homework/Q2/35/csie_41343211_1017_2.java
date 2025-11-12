import java.util.Scanner;

public class csie_41343211_1017_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String number = scanner.nextLine();

        boolean isWellOrdered = true;

        for (int i = 0; i < number.length() - 1; i++) {
            if (number.charAt(i) >= number.charAt(i + 1)) {
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
