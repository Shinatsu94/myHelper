import java.util.Scanner;

public class CSIE_41343229_1003_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int max = Math.max(A, Math.max(B, C));
        int min = Math.min(A, Math.min(B, C));

        long sum = (long) A + B + C;   // 避免加總溢位
        int mid = (int) (sum - max - min);

        System.out.println(min);
        System.out.println(mid);
        System.out.println(max);
        sc.close();
    }
}
