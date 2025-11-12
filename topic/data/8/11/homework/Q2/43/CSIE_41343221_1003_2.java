import java.util.Scanner;

public class CSIE_41343221_1003_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int A = scanner.nextInt(); 


        int B = scanner.nextInt(); 


        int C = scanner.nextInt(); 
        
        scanner.close(); 
        

           
    
        int max = (A > B) ? ((A > C) ? A : C) : ((B > C) ? B : C);

      
 
        int min = (A < B) ? ((A < C) ? A : C) : ((B < C) ? B : C);
        
       
 
        int mid = (A + B + C) - max - min;


 	System.out.println( + min);
	System.out.println( + mid);
 	System.out.println( + max);

    }
}