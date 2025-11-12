import java.util.Scanner;

public class CSIE_41343202_1031_2{
    
    public static int[] MA(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        
        for (int i = 0; i < n - 1; i++) {
            int max = arr[i + 1];
            for (int j = i + 2; j < n; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            result[i] = max;
        }
        result[n - 1] = -1;
        
        return result;
    }
    
    public static void pA(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int length = scanner.nextInt();
        
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        
        
        int[] result =MA(array);
        pA(result);
        
        scanner.close();
    }
}
