import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();              // 讀入高度 (0 < n <= 20)

        // 建立下三角形二維陣列：第 i 列長度為 i+1
        char[][] tri = new char[n][];
        for (int i = 0; i < n; i++) {
            tri[i] = new char[i + 1];
            Arrays.fill(tri[i], '*');      // 由左到右填入 '*'
        }

        // 列印：元素間不加空白
        for (int i = 0; i < n; i++) {
            System.out.println(new String(tri[i]));
        }
    }
}
