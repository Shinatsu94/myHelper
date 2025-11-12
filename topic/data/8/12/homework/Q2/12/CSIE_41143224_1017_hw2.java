import java.util.Scanner;

public class WellOrderedChecker {

    public static boolean isWellOrdered(String numberStr) {
        int n = numberStr.length();
        
        if (n <= 1) {
            return false;
        }
        
        for (int i = 1; i < n; i++) {
            if (numberStr.charAt(i - 1) >= numberStr.charAt(i)) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNext()) {
            String inputStr = scanner.next();
            
         
            try {
                int inputNumber = Integer.parseInt(inputStr);
                
                if (isWellOrdered(inputStr)) {
                    System.out.println(inputNumber + " is well-ordered number.");
                } else {
                    System.out.println(inputNumber + " is not well-ordered number.");
                }
            } catch (NumberFormatException e) {
       
                System.out.println(inputStr + " is not a valid number.");
            }
        }
        
        scanner.close();
    }
}