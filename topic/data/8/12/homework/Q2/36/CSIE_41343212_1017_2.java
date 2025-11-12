import java.util.Scanner;

public class CSIE_41343212_1017_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String num = input.nextLine();
        boolean isWell_ordered = true;
        for (int i = 0; i < num.length() - 1; i++) {
            if (num.charAt(i) >= num.charAt(i + 1)) {
                isWell_ordered = false;
                break;
            }

        }

        System.out.println(isWell_ordered ? num + " is well-ordered number." : num + " is not well-ordered number.");
        input.close();
    }
}
