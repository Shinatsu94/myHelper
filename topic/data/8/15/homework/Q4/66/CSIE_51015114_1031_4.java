import java.util.Scanner;

class CSIE_51015114_1031_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();     // 下三角形高度
        int num = sc.nextInt();   // 要尋找的數字

        // 建立完整下三角形二維陣列
        int[][] arr = new int[n][];
        int cnt = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = new int[i + 1]; // 每列 i+1 個元素
            for (int j = 0; j <= i; j++) {
                arr[i][j] = cnt++;
            }
        }

        // 尋找 num
        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (arr[i][j] == num) {
                    System.out.printf("%d[%d, %d]\n", num, i + 1, j + 1);
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (!found) {
            System.out.printf("not find %d in array.", num);
        }

        sc.close();
    }
}
