import java.util.Scanner;

public class CSIE_41343212_1017_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String num = input.nextLine();

        StringBuilder reversed = new StringBuilder();
        for (int i = num.length() - 1; i >= 0; i--) {
            reversed.append(num.charAt(i));
        }

        String result = reversed.toString().replaceFirst("^0+", "");
        System.out.println(result);

        input.close();
    }
}