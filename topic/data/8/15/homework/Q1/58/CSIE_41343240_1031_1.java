
//Date:2025/10/31
//Creator:41343240黃榮裕
//Funtion:讀入使用者輸入的任意長度一維陣列(, 使用者先輸入陣列長度，然後逐一輸入陣列內容)，程式可以輸出 selection sort 排序前後陣列的內容
import java.util.Scanner;

public class CSIE_41343240_1031_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        selectionSort(arr);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1)
                System.out.print(" ");
        }
        System.out.println();

        sc.close();
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
