import java.util.Scanner; 
/**
 * * 1. 讀取高度 n
 * 2. 讀取要尋找的數字 num
 * 3. 計算 n 層下三角矩陣的總元素個數 (maxNum)
 * 4. 判斷 num 是否在 1 到 maxNum 的範圍內
 * 5. 如果在範圍內，使用巢狀迴圈模擬填入並尋找 num
 * 6. 如果找到，印出 1-based 的 [列, 行]；如果不在範圍內，印出 "not find" 訊息
 */
public class CSIE_41343236_1031_3b { 
    public static void main(String[] args) { 
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int num = scanner.nextInt();
        
        int maxNum = n * (n + 1) / 2;
        
        if (num > maxNum || num < 1) {
            System.out.println("not find " + num + " in array.");
        } else {
            
            int counter = 1;
            boolean found = false;
            
            for (int row = 1; row <= n; row++) {
                
                for (int col = 1; col <= row; col++) {
                    
                    if (counter == num) {
                        System.out.println(num + "[" + row + ", " + col + "]");
                        found = true;
                        break; 
                    }
                    
                    counter++;
                }
                
                if (found) {
                    break; 
                }
            }
        }
        
        scanner.close();
    }
}