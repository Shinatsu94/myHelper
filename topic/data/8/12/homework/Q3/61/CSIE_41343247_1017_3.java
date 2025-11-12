/*
Name:盧冠宇
Student_ID:41343247
*/
import java.util.Scanner;

public class CSIE_41343247_1017_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.print(0);
        } else {
            if (n < 0) {
                System.out.print("-");
                n = -n;
            }
	    int o=0;
            while (n > 0) {
                if(n % 10!=0 || o==1){System.out.print(n % 10); o=1;}
                n /= 10;
            }
        }
    }
}
