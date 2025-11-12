import java.util.Scanner;
public class CSIE_41343215_1031_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        if (n > 0) {
            int maxFromRight = arr[n - 1];
            arr[n - 1] = -1;
            for (int i = n - 2; i >= 0; i--) {
                int temp = arr[i];
                arr[i] = maxFromRight;
                if (temp > maxFromRight) maxFromRight = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) System.out.print(" ");
        }
        System.out.println(); 
        scanner.close();
    }
}