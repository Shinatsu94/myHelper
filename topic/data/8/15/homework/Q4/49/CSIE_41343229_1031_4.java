import java.util.Scanner;
public class CSIE_41343229_1031_4  {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();   
            int num = sc.nextInt(); 
            int[][] tri = new int[n][];
            int cur = 1;
            for (int i = 0; i < n; i++) {
                tri[i] = new int[i + 1];
                for (int j = 0; j <= i; j++) {
                    tri[i][j] = cur++;
                }
            }
            long total = 1L * n * (n + 1) / 2;
            if (num <= 0 || num > total) {
                System.out.printf("not find %d in array.%n", num);
                return;
            }
            int r = (int) Math.ceil((Math.sqrt(1 + 8.0 * num) - 1) / 2.0);
            int prevSum = r * (r - 1) / 2;
            int c = num - prevSum;  
            System.out.printf("%d[%d, %d]%n", num, r, c);
        }
    }
}