import java.util.Scanner;
public class CSIE_51015120_1031_3b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][];
        int num = 1;

        for (int i = 0; i < n; i++) {
            arr[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                arr[i][j] = num++;
            }
        }
        int target = sc.nextInt();

        int maxValue = n * (n + 1) / 2;
        if (target > maxValue || target <= 0) {
            System.out.println("not find " + target + " in array.");
            return;
        }

        boolean found = false;
        for (int i = 0; i < n && !found; i++) {
            for (int j = 0; j <= i; j++) {
                if (arr[i][j] == target) {
                    System.out.println(target + "[" + (i + 1) + ", " + (j + 1) + "]");
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("not find " + target + " in array.");
        }
        sc.close();
    }
}
