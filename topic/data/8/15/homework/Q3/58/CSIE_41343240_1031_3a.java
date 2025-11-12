
//Date:2025/10/31
//Creator:41343240黃榮裕
//Funtion:建立一個下三角形二維陣列，高度 n 由使用者輸入，其中 0<n<=20，寫一程式將此三角形以'*'符號顯示在銀幕。
import java.util.Scanner;

public class CSIE_41343240_1031_3a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();

        if (n <= 0 || n > 20) {
          
            sc.close();

        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}