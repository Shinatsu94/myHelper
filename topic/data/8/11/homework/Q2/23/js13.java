import java.util.Scanner;
public class js13{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		int max,min,mid;
		int A,B,C;
		A = s.nextInt();
		B = s.nextInt();
		C = s.nextInt();
		max=A>B&&A>C?A:B>C?B:C;
		min=A<B&&A<C?A:B<C?B:C;
		mid=A+B+C-max-min;
		System.out.println(min);
System.out.println(mid);
System.out.println(max);

       }

    }