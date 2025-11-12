import java.util.Scanner;

public class CSIE_41343208_1031_3b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] tri = new int[n][n];
        int num = 1;

        // 依序填入下三角形
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                tri[i][j] = num++;
            }
        }

        int target = sc.nextInt();

        // 找出該數字的列與行
        boolean found = false;
        for (int i = 0; i < n && !found; i++) {
            for (int j = 0; j <= i; j++) {
                if (tri[i][j] == target) {
                    System.out.printf("%d[%d, %d]\n", target, i + 1, j + 1);
                    found = true;
                    break;
                }
            }
        }

        if (!found)
            System.out.printf("not find %d in array.\n",target);
    }
}
