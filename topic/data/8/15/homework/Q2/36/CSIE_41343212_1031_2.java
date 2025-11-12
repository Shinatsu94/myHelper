import java.util.Scanner;

public class CSIE_41343212_1031_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) arr[i] = input.nextInt();

        int max = arr[length-1];
        arr[length-1] = -1;
        for (int i = length - 2; i >= 0; i--) {
            int tmp = arr[i];
            arr[i] = max;
            if (tmp > max) max = tmp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(" ");
        }
        System.out.println();
        input.close();
    }
}
