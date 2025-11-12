import java.util.Scanner;

public class CSIE_51015120_1017_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int a = number;

        int bignumber = a % 10;
        a = a / 10;

        int answer = 1;

        while (a > 0) {
            int nownumber = a % 10;
            if (nownumber >= bignumber) { 
                answer = 0;
                break;
            }
            bignumber = nownumber;
            a = a / 10;
        }

        if (answer==1) {
            System.out.printf("%d is well-ordered number.%n", number);
        } 
        else {
            System.out.printf("%d is not well-ordered number.%n", number);
        }
    }
}
