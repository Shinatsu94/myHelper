import java.util.Scanner;

public class ArrayReplacement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        
        int[] array = new int[length];
        
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        if (length == 0) {
            scanner.close();
            return;
        }
        if (length == 1) {
            System.out.println("-1");
            scanner.close();
            return;
        }

        int max_right = -1;
        
        for (int i = length - 1; i >= 0; i--) {
            int current_element = array[i];
            
            array[i] = max_right;
            
            if (current_element > max_right) {
                max_right = current_element;
            }
        }
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        
        scanner.close();
    }
}