public class CSIE_41343216_1003_3 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int A = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= 100000; i++) {
            int num = i;
            int sum = 0;

            // 計算每個數字的各位數字加總
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            if (sum == A) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
