import java.util.Scanner;

public class CSIE_41343226_1003_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int i = scn.nextInt();
	int j = scn.nextInt();
	i=i+j;
	j=i-j;
	i=i-j;
        System.out.println(i);
	System.out.println(j);
    }
}