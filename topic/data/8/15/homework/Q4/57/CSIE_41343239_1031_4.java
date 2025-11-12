import java.util.Scanner;

public class csie_41343239_1031_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] triangle = new int[n][];
        int count = 1; // 從 1 開始填數字

        for (int i = 0; i < n; i++) {
            triangle[i] = new int[i + 1]; // 第 i 行有 i+1 個元素
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = count++;
            }
        }

        int num = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (triangle[i][j] == num) {
                    System.out.println(num + "[" + (i + 1) + ", " + (j + 1) + "]");
                    found = true;
                    break;
                }
            }
            if (found) break;
        }
        if (!found) {
            System.out.println("not find " + num + " in array.");
        }

        sc.close();
    }
}
