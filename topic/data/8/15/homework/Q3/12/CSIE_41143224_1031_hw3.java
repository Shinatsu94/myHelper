import java.util.Scanner;

public class LowerTriangleArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        while (true) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0 && n <= 20) { 
                    break;
                }
            } else {
                scanner.next();
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                 System.out.print('*');
            }
            System.out.println();
        }
        
        scanner.close();
    }
}