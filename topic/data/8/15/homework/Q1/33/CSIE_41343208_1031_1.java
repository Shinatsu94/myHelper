import java.util.Scanner;

public class CSIE_41343208_1031_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
         
        // Selection Sort
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // 交換
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        // 輸出排序後

        for (int i = 0; i < n-1; i++) {
            System.out.print(arr[i] + " ");
        }
	System.out.print(arr[n-1]);
	System.out.println();
    }
}
