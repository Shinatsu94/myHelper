import java.util.Scanner;

public class CSIE_41343212_1031_3b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long num = input.nextLong();
        long totalElements = (long) n * (n + 1) / 2;
        if (num > totalElements) {
            System.out.println("not find " + num + " in array.");
            return;
        }
        int [][] tri = new int[n][n];
        int value = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) tri[i][j] = value++;
        }

        int row = 0;
        long sum = 0;
        while (sum < num) {
            row++;
            sum += row;
        }

        long prevSum = sum - row;
        int col = (int)(num - prevSum);
        System.out.println(num + "[" + row + ", " + col + "]");
        input.close();
    }
}
