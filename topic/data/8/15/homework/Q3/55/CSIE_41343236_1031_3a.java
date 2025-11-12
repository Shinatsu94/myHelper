import java.util.Scanner;

/**
 * * 題目要求：
 * 1. 讀取一個整數 n (0 < n <= 20)
 * 2. 
 * 3. 
 */
public class CSIE_41343236_1031_3a {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // 1. 
        int n = scanner.nextInt();
        
        // 2. 
        // 
        if (n > 0 && n <= 20) {
            
            // 3. 
            
            // 外層迴圈：控制 "列" (row)
            // 
            for (int i = 0; i < n; i++) {
                
                // 內層迴圈：控制 "行" (column)
                // 
                // 
                for (int j = 0; j <= i; j++) {
                    
                    // 
                    System.out.print("*");
                }
                
                // 
                System.out.println();
            }
        }
        
        scanner.close();
    }
}