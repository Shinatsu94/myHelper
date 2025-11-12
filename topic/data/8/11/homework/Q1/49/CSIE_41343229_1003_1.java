import java.util.Scanner;

public class CSIE_41343229_1003_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int A = sc.nextInt();
        
        int B = sc.nextInt();

        A ^= B;
        B ^= A;
        A ^= B;

 
        System.out.println( A);
        System.out.println( B);

        sc.close();
    }
}
