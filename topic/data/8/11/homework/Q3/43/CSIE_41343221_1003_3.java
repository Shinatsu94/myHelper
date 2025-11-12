import java.util.Scanner;

public class CSIE_41343221_1003_3 {

    public static int a(int n) {
        int b = 0;
        int c = n;
        
        while (c > 0) {
            int d = c % 10;
            b += d;
            c /= 10;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int A = s.nextInt();
        s.close();

        int c = 0; 

        for (int N = 1; N <= 100000; N++) {
            int d = a(N);
            
            if (d == A) {
                c++;
            }
        }
        System.out.println(c);
    }
}