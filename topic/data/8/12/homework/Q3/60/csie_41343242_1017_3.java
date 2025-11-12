import java.util.Scanner;

public class csie_41343242_1017_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        

        //System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
  
        int reversedNumber = reverseDigits(number);
        
    
        System.out.println(reversedNumber);
        
    
        scanner.close();
    }
    

    public static int reverseDigits(int number) {
        int reversed = 0;
        
      
        while (number != 0) {
           
            int digit = number % 10;
            
          
            reversed = reversed * 10 + digit;
            
     
            number = number / 10;
        }
        
        return reversed;
    }
}
