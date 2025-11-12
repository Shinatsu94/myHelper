import java.util.Scanner;

public class CSIE_41343233_1031_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int max = -1; // 最後一個元素替換成 -1
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            result[i] = max;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result[i]);
            if (i != n - 1) System.out.print(" ");
        }
    }
}
