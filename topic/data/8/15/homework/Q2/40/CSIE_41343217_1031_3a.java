import java.util.Scanner;

public class CSIE_41343217_1031_3a {

    public static void main(String[] args) {
        // 建立 Scanner 物件，用於讀取使用者輸入
        Scanner sc = new Scanner(System.in);
        
        // 讀取一個整數 n，這個 n 將決定三角形圖案的高度
        int n = sc.nextInt();
        
        // 呼叫 drawLowerTriangle 方法，傳入 n 進行繪製
        drawLowerTriangle(n); 

        // 關閉 Scanner 物件
        sc.close();
    }

    /**
     * 繪製一個由星號(*)組成的下三角圖案 (左下角對齊的直角三角形)。
     * * @param n 圖案的高度/行數。
     */
    public static void drawLowerTriangle(int n) {
        // 參數檢查：如果 n 小於等於 0 或大於 20，則不執行繪製並直接返回
        if (n <= 0 || n > 20) {
            return; 
        }

        // 外層迴圈：控制行數 (Rows)。從 i=1 到 n，共 n 行。
        for (int i = 1; i <= n; i++) {
            // 內層迴圈：控制每行要印出的星號數量 (Columns)。
            // 在第 i 行，j 從 1 到 i，表示印出 i 個星號。
            for (int j = 1; j <= i; j++) {
                // 印出一個星號，不換行
                System.out.print("*");
            }
            // 內層迴圈結束後，印出一個換行符號，開始新的一行
            System.out.println();
        }
    }
}