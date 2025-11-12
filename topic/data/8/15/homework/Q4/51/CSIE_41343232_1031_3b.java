import java.util.Scanner;

public class CSIE_41343232_1031_3b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();     // triangle height
        int num = in.nextInt();   // number to find

        // total numbers in triangle = n(n+1)/2
        int total = n * (n + 1) / 2;

        if (num > total) {
            System.out.println("not find " + num + " in array.");
            return;
        }

        // find row: smallest r such that r(r+1)/2 >= num
        int r = (int) Math.ceil((Math.sqrt(8.0 * num + 1) - 1) / 2.0);
        int prevSum = r * (r - 1) / 2;

        int c = num - prevSum;  // 1-based column index

        System.out.println(num + "[" + r + ", " + c + "]");
        in.close();
    }
}
