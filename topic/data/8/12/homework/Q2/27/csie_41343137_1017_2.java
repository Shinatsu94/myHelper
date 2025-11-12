import java.util.Scanner;

public class csie_41343137_1017_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("");
        String s = sc.next();
        boolean ok = true;

        for (int i = 0; i < s.length() - 1; i++)
            if (s.charAt(i) >= s.charAt(i + 1)) ok = false;

        System.out.println(s+ " "+(ok ? "is well-ordered number." : "is not well-ordered number."));
        sc.close();
    }
}
