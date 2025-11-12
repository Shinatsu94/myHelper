import java.util.Scanner;

public class CSIE_41343232_1031_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            int max = a[i + 1];
            for (int j = i + 1; j < n; j++) {
                if (a[j] > max) {
                    max = a[j];
                }
            }
            a[i] = max;
        }

        a[n - 1] = -1;

        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
            if (i < n - 1) System.out.print(" ");
        }
        System.out.println();

        in.close();
    }
}
