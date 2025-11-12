import java.util.Scanner;

public class csie_41343137_1003_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        
        A = A + B;
        B = A - B;
        A = A - B;

       
        System.out.println(A);
        System.out.println(B);
    }
}
