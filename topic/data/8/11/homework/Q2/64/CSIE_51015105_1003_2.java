/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.Scanner;

public class CSIE_51015105_1003_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = (a > b ? a : b);
        max = (max > c ? max : c);

        int min = (a < b ? a : b);
        min = (min < c ? min : c);

        int mid = a + b + c - max - min;

        System.out.println(min);
        System.out.println(mid);
        System.out.println(max);

        sc.close();
    }
}
