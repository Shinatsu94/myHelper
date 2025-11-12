import java.util.Scanner;

class CSIE_51015114_1031_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = sc.nextInt();
        }

        // Find the max to the right for each element
        for (int i = 0; i < n - 1; i++) {
            int max = ans[i + 1];
            for (int j = i + 1; j < n; j++) {
                if (ans[j] > max) {
                    max = ans[j];
                }
            }
            ans[i] = max;
        }
        ans[n - 1] = -1; // last element is always -1

        // Output
        for (int i = 0; i < n; i++) {
            if (i == 0)
                System.out.printf("%d", ans[i]);
            else
                System.out.printf(" %d", ans[i]);
        }
    }
}
