/* file nmae: CSIE_41343212_1003_2.java
   student: 李品劭
   ID: 41343212
   function: enter three numbers, to find min, mid and max
 */

import java.util.Scanner;

public class CSIE_41343212_1003_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int min = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        int mid = a + b + c - max - min;
        System.out.println(min);
        System.out.println(mid);
        System.out.println(max);
    }
}
