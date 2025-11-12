/* file name: CSIE_41343212_1003_1.java
   student: 李品劭
   ID: 41343212
   function: using xor to swap a, b
 */

import java.util.Scanner;

public class CSIE_41343212_1003_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println(a);
        System.out.println(b);
    }
}