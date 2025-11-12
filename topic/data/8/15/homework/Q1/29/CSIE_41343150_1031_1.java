import java.util.Scanner;

public class CSIE_41343150_1031_1 {
    public static void main(String[] args) {
        Scanner im = new Scanner(System.in);
        int n = im.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = im.nextInt();
        }

        sort(arr);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i != n - 1) System.out.print(" ");
        }

        im.close();
    }

    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int m = i;
            for (int j = m + 1; j < n; j++) {
                if (arr[j] < arr[m]) {
                    m = j;
                }
            }
            int temp = arr[m];
            arr[m] = arr[i];
            arr[i] = temp;
        }
    }
}
