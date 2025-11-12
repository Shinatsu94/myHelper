
import java.util.Scanner;

public class CSIE_41343241_1017_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int T=0;
        while(n>0)
        {
            T = T*10 + n%10;
            n/=10;
        }
        System.out.println(T);
    }
}
