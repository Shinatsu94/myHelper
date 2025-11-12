import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    // 陣列高度
        int num = sc.nextInt();  // 要尋找的數字
        sc.close();

        int total = n * (n + 1) / 2; // 下三角形的總元素數

        if (num > total || num <= 0) {
            System.out.println("not find " + num + " in array.");
            return;
        }

        int row = 1;
        int count = 1;

        // 找出所在列
        while (num > count) {
            row++;
            count += row;
        }

        int start = count - row + 1;   // 該列起始數字
        int col = num - start + 1;     // 該列中的位置（行）

        System.out.println(num + "[" + row + ", " + col + "]");
    }
}
