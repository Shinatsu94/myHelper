import java.util.Scanner;

public class csie_1003_41343214 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

               
        int A = scanner.nextInt();


        int B = scanner.nextInt();

  

        
        A = A ^ B;
        B = A ^ B;
        A = A ^ B;

       
        System.out.println(A);
        System.out.println(B);

        scanner.close();
    }
}
