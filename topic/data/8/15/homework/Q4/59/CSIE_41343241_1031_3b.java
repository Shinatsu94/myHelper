import java.util.Scanner;

public class CSIE_41343241_1031_3b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 輸入高度 n（即陣列行數）
        int n = sc.nextInt();

        // 輸入要尋找的數字 
        int num = sc.nextInt();

        // 建立下三角形二維陣列
        int[][] arr = new int[n][];
        int value = 1;

        // 填入連續數字
        for (int i = 0; i < n; i++) {
            arr[i] = new int[i + 1]; // 第 i 列有 i+1 個元素
            for (int j = 0; j <= i; j++) {
                arr[i][j] = value++;
            }
        }

        // 找出 num 位置
        boolean found = false;
        for (int i = 0; i < n && !found; i++) {
            for (int j = 0; j <= i; j++) {
                if (arr[i][j] == num) {
                    System.out.println(num + "[" + (i + 1) + ", " + (j + 1) + "]");
                    found = true;
                    break;
                }
            }
        }

        // 若找不到
        if (!found) {
            System.out.println("not find " + num + " in array.");
        }
    }
}