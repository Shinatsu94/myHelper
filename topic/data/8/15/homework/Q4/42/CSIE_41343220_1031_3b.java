import java.util.Scanner;

public class CSIE_41343220_1031_3b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //System.out.print("請輸入下三角形高度：");
        int n = sc.nextInt(); // 陣列高度

        //System.out.print("請輸入要尋找的數字 (num < 100000)：");
        int num = sc.nextInt();

        // 建立下三角形陣列
        int[][] tri = new int[n][];
        int value = 1;

        for (int i = 0; i < n; i++) {
            tri[i] = new int[i + 1]; // 第 i 列有 i+1 個元素
            for (int j = 0; j <= i; j++) {
                tri[i][j] = value;
                value++;
            }
        }

        // 總共有 n*(n+1)/2 個元素
        int maxValue = n * (n + 1) / 2;

        if (num > maxValue || num < 1) {
            System.out.print("not find " + num + " in array.");
            return;
        }

        // 找出 num 所在位置
        outer:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (tri[i][j] == num) {
                    System.out.print(num + "[" + (i + 1) + ", " + (j + 1) + "]");
                    break outer; // 找到後結束搜尋
                }
            }
        }
    }
}
