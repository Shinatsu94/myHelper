import java.util.Scanner;

public class CSIE_41245139_1017_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();        
        boolean isWellOrdered = true;        
        for (int i = 0; i < num.length() - 1; i++) {
            if (num.charAt(i) >= num.charAt(i + 1)) {
                isWellOrdered = false;
                break;
            }
        }
        if (isWellOrdered) {
            System.out.println(num + " is well-ordered number.");
        } else {
            System.out.println(num + " is not well-ordered number.");
        }

        scanner.close();
    }
}