public class CSIE_41343216_1003_1 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        // 交換 A 與 B
        A = A + B;
        B = A - B;
        A = A - B;

        // 印出交換後結果
        System.out.println(A);
        System.out.println(B);

        sc.close();
    }
}
