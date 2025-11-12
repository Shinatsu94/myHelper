import java.util.Scanner;

public class csie_1031_41343214_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        int max = -1;
        for (int i = n - 1; i >= 0; i--) {
            int c = arr[i];
            arr[i] = max;
            if (c > max) {
                max = c;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        sc.close();
    }
}
