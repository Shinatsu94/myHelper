import java.util.Scanner;

public class CSIE_41343107_1031_2 {
    public static void main(String args[]) {
        Scanner same = new Scanner(System.in);
        int n = same.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = same.nextInt();
        }
        int[] b = new int[n];
        b[n - 1] = -1;
             for (int i = n - 2; i >= 0; i--) {
            int max = a[i + 1]; 
            for (int j = i + 1; j < n; j++) {
                if (a[j] > max) {
                    max = a[j];
                }
            }
            b[i] = max;
        }
	    for (int i = 0; i < n-1; i++) {
            System.out.print(b[i] + " ");
        }
	    System.out.print(b[n-1]);
    }
}

/*
 姓名: 王世豪
 學號: 41343107
 功能: 將陣列每一元素置換為出現在它之後的最大值(陣列最後一個元素直接替換為-1)
 日期: 2025/10/31
*/
