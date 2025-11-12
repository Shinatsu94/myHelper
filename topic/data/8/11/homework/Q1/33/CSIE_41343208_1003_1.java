import java.util.Scanner;

public class CSIE_41343208_1003_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        
        int A = sc.nextInt();
        int B = sc.nextInt();


        
        A = A + B;
        B = A - B;
        A = A - B;

        System.out.println(+ A  );
	System.out.println(+ B  );

    }
}
