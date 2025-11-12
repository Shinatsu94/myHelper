import java.util.Scanner;

public class CSIE_41343221_1031_2 {

    public static int findMax(int[] arr, int startIndex) {
        if (startIndex >= arr.length) {
            return -1;
        }
        
        int maxVal = arr[startIndex];
        
        for (int i = startIndex + 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        
        if (a <= 0) {
            scanner.close();
            return;
        }
        
        int[] x = new int[a];
 
        for (int i = 0; i < a; i++) {
            x[i] = scanner.nextInt();
        }

        int[] result = new int[a];
        
        for (int i = 0; i < a - 1; i++) {
            int maxAfter = findMax(x, i + 1);
            result[i] = maxAfter;
        }

        result[a - 1] = -1;

        for (int i = 0; i < a; i++) {
            System.out.print(result[i]);
            
            if (i < a - 1) {
                System.out.print(" ");
            }
        }
        
        System.out.println();
        
        scanner.close();
    }
}