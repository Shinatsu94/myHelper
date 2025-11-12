import java.util.Scanner;

public class TriangularArrayFinder {

    private static long calculateMaxValue(int n) {
        return (long) n * (n + 1) / 2;
    }

    public static void findPosition(int n, int num) {
        long maxValue = calculateMaxValue(n);

        if (num <= 0 || num > maxValue) {
            System.out.println("not find " + num + " in array.");
            return;
        }

        int row = 0;
        long lastValInRow = 0; 
        
        for (int r = 1; r <= n; r++) {
            lastValInRow = (long) r * (r + 1) / 2; 

            if (lastValInRow >= num) {
                row = r;
                break;
            }
        }
        
        long previousLastVal = (long) (row - 1) * row / 2;
        
        int col = (int) (num - previousLastVal);

        System.out.println(num + "[" + row + ", " + col + "]");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = 0;
        if (scanner.hasNextInt()) {
            n = scanner.nextInt(); 
        } else {
             return;
        }

        int num = 0;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt(); 
        } else {
             return;
        }

        findPosition(n, num);
        
        scanner.close();
    }
}