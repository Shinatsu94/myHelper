import java.util.Scanner;

public class CSIE_41343226_1003_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int i = scn.nextInt();
	int j = scn.nextInt();
	int k = scn.nextInt();
	int max=((i<j)?((j<k)?k:j):((i<k)?k:i));
	int min=((i>j)?((j<k)?j:k):((i<k)?i:k));
	System.out.println(min);
	System.out.println((i+j+k-max-min));
        System.out.println(max);

    }
}