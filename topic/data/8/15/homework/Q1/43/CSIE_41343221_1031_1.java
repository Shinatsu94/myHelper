import java.util.Scanner;

public class CSIE_41343221_1031_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                int a = scanner.nextInt();
        int [] x = new int[a];
        

        for (int i = 0; i < a; i++) {
            int b = scanner.nextInt();    
            x[i] = b;
        }
        
for (int i = 0; i < a - 1; i++) {
            for(int j = 0; j < a - 1 - i; j++) {
                if(x[j] > x[j + 1]) {
     
                    int temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }
            }
        }
                for (int i = 0; i < a; i++) {

            System.out.print(x[i]);
            
       
            if (i < a - 1) {
                System.out.print(" ");
            }
        }
        

        System.out.println();
        
        scanner.close();
    }
}