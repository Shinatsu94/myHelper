import java.util.Scanner;

public class CSIE_41343217_1003_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B, C;
        int max, min, mid;
        
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        
        max = (A > B) ? ((A > C) ? A : C) : ((B > C) ? B : C);

        min = (A < B) ? ((A < C) ? A : C) : ((B < C) ? B : C);
        
        mid = A + B + C - max - min;
        
        System.out.println(max);
        System.out.println(min);
        System.out.println(mid);
        
        scanner.close();
    }
}