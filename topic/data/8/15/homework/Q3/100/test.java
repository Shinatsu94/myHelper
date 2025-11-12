import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.print("請輸入下三角形的高度 (n): ");
        int n = sc.nextInt();
        sc.close();

        int[][] triangle = new int[n][];
        int currentNumber = 1;
        int targetRow = -1, targetCol = -1;
        boolean found = false;

        // 建立並填入陣列，同時尋找目標數字
        for (int i = 0; i < n; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = currentNumber;
                
                System.out.print("*");
                currentNumber++;
            }
            System.out.println();
        }
    }
}