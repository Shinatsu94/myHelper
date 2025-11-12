import java.util.Scanner;

public class CSIE_41343236_1017_2 {
    
    public static boolean isWellOrdered(String num) {
        // Check if the number is empty or has only one digit
        if (num.length() <= 1) {
            return true;
        }
        
        // Check each digit to ensure they are strictly increasing
        for (int i = 0; i < num.length() - 1; i++) {
            char current = num.charAt(i);
            char next = num.charAt(i + 1);
            
            // If current digit is not less than next digit, it's not well-ordered
            if (current >= next) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine().trim();
        
        // Check if the number is well-ordered
        if (isWellOrdered(input)) {
            System.out.println(input + " is well-ordered number.");
        } else {
            System.out.println(input + " is not well-ordered number.");
        }
        
        scanner.close();
    }
}