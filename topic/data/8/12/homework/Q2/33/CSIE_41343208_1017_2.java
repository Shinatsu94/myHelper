import java.util.Scanner;

public class CSIE_41343208_1017_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
	int a=num;

        int prevDigit = 10;  
        boolean isWellOrdered = true;

        while (num > 0) {
            int currentDigit = num % 10;  

            if (currentDigit >= prevDigit) {
                isWellOrdered = false;
                break;
            }

            prevDigit = currentDigit;
            num /= 10;        }

    if (isWellOrdered)
        System.out.printf("%d is well-ordered number.\n", a);
    else
        System.out.printf("%d is not well-ordered number.\n", a);
    }
}
