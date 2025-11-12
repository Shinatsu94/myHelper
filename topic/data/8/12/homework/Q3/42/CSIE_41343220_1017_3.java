import java.util.Scanner;

public class CSIE_41343220_1017_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        
        String input = scanner.nextLine();

        
        StringBuilder reversed = new StringBuilder(input).reverse();

        
        String result = reversed.toString().replaceFirst("^0+(?!$)", "");

        
        System.out.println(result);

        scanner.close();
    }
}
