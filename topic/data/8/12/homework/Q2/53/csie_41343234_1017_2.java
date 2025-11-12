import java.util.Scanner;

public class csie_41343234_1017_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();          
        String str = String.valueOf(number);     

        boolean isWellOrdered = true;


        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) >= str.charAt(i + 1)) {
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
