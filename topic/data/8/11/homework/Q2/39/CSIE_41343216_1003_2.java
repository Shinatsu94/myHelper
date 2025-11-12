public class CSIE_41343216_1003_2 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // 找最大值
        int max = (A > B ? (A > C ? A : C) : (B > C ? B : C));
        // 找最小值
        int min = (A < B ? (A < C ? A : C) : (B < C ? B : C));
        // 中間值 = 總和 - 最大值 - 最小值
        int mid = A + B + C - max - min;

        // 從小到大印出
        System.out.println(min);
        System.out.println(mid);
        System.out.println(max);

        sc.close();
    }
}
