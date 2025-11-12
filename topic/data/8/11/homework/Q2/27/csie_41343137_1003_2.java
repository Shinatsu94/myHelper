import java.util.Scanner;

public class csie_41343137_1003_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int max = (A > B) ? ((A > C) ? A : C) : ((B > C) ? B : C);
        int min = (A < B) ? ((A < C) ? A : C) : ((B < C) ? B : C);
        int mid = A + B + C - max - min;

        System.out.println(min);
        System.out.println(mid);
        System.out.println(max);
    }
}
