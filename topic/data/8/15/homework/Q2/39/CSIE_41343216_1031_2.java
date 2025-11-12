import java.util.Scanner;
public class CSIE_41343229_1031_2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            int maxRight = Integer.MIN_VALUE;
            for (int i = n - 1; i >= 0; i--) {
                int cur = a[i];
                a[i] = (i == n - 1) ? -1 : maxRight; 
                if (cur > maxRight) maxRight = cur;  
            }
            for (int i = 0; i < n; i++) {
                if (i > 0) System.out.print(" ");
                System.out.print(a[i]);
            }
        }
    }
}
