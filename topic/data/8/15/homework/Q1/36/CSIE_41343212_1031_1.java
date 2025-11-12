import java.sql.Array;
import java.util.Scanner;

public class CSIE_41343212_1031_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int []arr = new int[length];
        for (int i = 0; i < arr.length; i++) arr[i] = input.nextInt();

        int minIndex;
        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            for (int j = i; j < arr.length; j++) if (arr[j] < arr[minIndex]) minIndex = j;

            if (minIndex != i) {
                int tmp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = tmp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(" ");
        }
        System.out.println();
        input.close();
    }
}