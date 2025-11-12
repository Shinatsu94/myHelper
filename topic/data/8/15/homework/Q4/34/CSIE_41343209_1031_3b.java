import java.util.Scanner;

public class CSIE_41343209_1031_3b{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] triangle = new int[n][];
        int numCounter = 1;
        for (int i = 0; i < n; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = numCounter++;
            }
        }

        int maxNum = numCounter - 1;

        int num = sc.nextInt();

        if (num > maxNum) {
            System.out.println("not find " + num + " in array.");
            return;
        }

        boolean found = false;
        for (int i = 0; i < n && !found; i++) {
            for (int j = 0; j <= i; j++) {
                if (triangle[i][j] == num) {
                    System.out.println(num + "[" + (i + 1) + ", " + (j + 1) + "]");
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("not find " + num + " in array.");
        }
    }
}
