import java.util.Scanner;

public class CSIE_41343231_1017_2 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();		

        int one = input / 100;             
        int two = (input / 10) % 10;       
        int three = input % 10;            

        if ((one < two) && (two < three)) {
            System.out.printf("%d is well-ordered number.%n", input);
        } else {
            System.out.printf("%d is not well-ordered number.%n", input);
        }
    }
}
