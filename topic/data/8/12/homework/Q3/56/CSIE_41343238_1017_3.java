import java.util.Scanner;
public class CSIE_41343238_1017_3
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		while(n%10==0)
		{
			n=n/10;
		}
		
		String s1 = String.valueOf(n);		
		for(int w=s1.length();w>0;w--)
		{
			System.out.print(s1.charAt(w-1));
		}
	}
}
		