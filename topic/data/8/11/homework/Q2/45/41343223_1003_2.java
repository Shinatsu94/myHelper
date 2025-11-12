import java.util.Scanner;

public class CSIE_41343223_1003_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 讀取三個數字
      
        int A = scanner.nextInt();


        int B = scanner.nextInt();

        
        int C = scanner.nextInt();

        // 最大值 max
        int max = (A > B) ? ((A > C) ? A : C) : ((B > C) ? B : C);

        // 最小值 min
        int min = (A < B) ? ((A < C) ? A : C) : ((B < C) ? B : C);

        // 中間值 mid
        int mid = (A + B + C) - max - min;

        // 輸出結果
        System.out.println(min);
        System.out.println(mid);
        System.out.println(max);
    }
}
