import java.util.Scanner;

public class CSIE_41343202_1031_1 {
    
    public static void SS(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int length = scanner.nextInt();
     
        int[] array = new int[length];
        
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        
        int[] originalArray = array.clone();
        
        SS(array);
           
        for (int i = 0; i < length; i++) {
            System.out.print(array[i]);
            if (i < length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        
        scanner.close();
    }
}
