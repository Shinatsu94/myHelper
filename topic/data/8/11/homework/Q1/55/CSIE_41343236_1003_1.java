import java.util.Scanner;

public class CSIE_41343236_1003_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 讀入兩個整數
        int A = sc.nextInt();
        int B = sc.nextInt();

        A = A + B;
        B = A - B;
        A = A - B;

        System.out.println(A);
        System.out.println(B);

        sc.close();
    }
}
