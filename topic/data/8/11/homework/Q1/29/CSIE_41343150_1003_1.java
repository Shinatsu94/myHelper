import java.util.Scanner;

public class CSIE_41343150_1003_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //物件名scanner//
        System.out.print("輸入A");
        int A = scanner.nextInt();

        System.out.print("輸入B");
        int B = scanner.nextInt();

        A = A ^ B;
        B = A ^ B;
        A = A ^ B;

        System.out.println("交換後：A = " + A + ", B = " + B);// +連接//

        scanner.close();
    }
}
