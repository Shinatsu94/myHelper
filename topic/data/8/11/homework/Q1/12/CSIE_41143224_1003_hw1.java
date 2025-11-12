import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //System.out.println("請輸入第一個數字 A：");
        int A = scanner.nextInt();
        //System.out.println("請輸入第二個數字 B：");
        int B = scanner.nextInt();

        A = A ^ B;
        B = A ^ B;
        A = A ^ B;
        
        System.out.println(+ A );
	System.out.println(+ B );
        
        scanner.close();
    }
}