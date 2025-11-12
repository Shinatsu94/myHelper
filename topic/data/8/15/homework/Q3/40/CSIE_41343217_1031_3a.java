import java.util.Scanner;

public class CSIE_41343217_1031_3a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. 讀取使用者輸入的陣列高度 n
        int n = sc.nextInt();
        sc.close();
        
        // 2. 參數檢查
        if (n <= 0 || n > 20) {
            // 根據題目限制 (0 < n <= 20)，若輸入不合法則直接結束
            return; 
        }

        // 3. 建立並填充下三角形二維陣列
        // 這裡使用 String 陣列，每行儲存一個由 '*' 組成的字串
        String[] triangle = createLowerTriangleArray(n);
        
        // 4. 列印陣列內容
        printArray(triangle);
    }

    /**
     * 建立一個儲存下三角形圖案的字串陣列。
     * @param n 陣列的高度 (行數)。
     * @return 包含下三角形每一行字串的陣列。
     */
    public static String[] createLowerTriangleArray(int n) {
        // 宣告一個大小為 n 的字串陣列，代表 n 行
        String[] arr = new String[n];
        
        // 使用 StringBuilder 來高效地建構每行的字串
        StringBuilder sb = new StringBuilder(); 
        
        // 外層迴圈：從 i=0 (第一行) 到 n-1 (最後一行)
        for (int i = 0; i < n; i++) {
            // 在第 i 行 (從 0 開始計算)，需要 i+1 個 '*' 符號。
            // 在這裡我們只需在上一行的基礎上多添加一個 '*'
            sb.append('*');
            
            // 將建構好的字串存入陣列中
            arr[i] = sb.toString();
        }
        
        return arr;
    }

    /**
     * 列印字串陣列中的每個元素，每個元素佔一行。
     * 元素之間無需任何空白符號。
     * @param arr 要列印的字串陣列。
     */
    public static void printArray(String[] arr) {
        // 遍歷並印出陣列中的每個字串
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}