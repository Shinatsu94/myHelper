import java.util.Scanner;

public class CSIE_41343236_1003_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int max = (A > B) ? ((A > C) ? A : C) : ((B > C) ? B : C);

        int min = (A < B) ? ((A < C) ? A : C) : ((B < C) ? B : C);

        int mid = A + B + C - max - min;

        System.out.println( min);
        System.out.println( mid);
 	System.out.println( max);

        sc.close();
    }
}
