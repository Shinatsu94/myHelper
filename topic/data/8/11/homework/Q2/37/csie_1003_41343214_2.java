import java.util.Scanner;

public class csie_1003_41343214_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        int a = scanner.nextInt();


        int b = scanner.nextInt();

        
        int c = scanner.nextInt();
             int min = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
                 System.out.println( min); 
             int mid = (a > b)? ((a < c) ? a : (b > c ? b : c)): ((b < c) ? b : (a > c ? a : c));
                 System.out.println( mid);
             int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
                 System.out.println( max);
            
            
    
        scanner.close();
    }
}
