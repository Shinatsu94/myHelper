import java.util.Scanner;

public class CSIE_51015120_1003_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        // 再算最小值
        int min = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
        // mid值 = 總和 - max - min
        int mid = a + b + c - max - min;
        
        System.out.println(min);
        System.out.println(mid);
        System.out.println(max);
    }
}