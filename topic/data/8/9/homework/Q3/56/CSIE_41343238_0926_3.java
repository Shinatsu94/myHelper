import java.util.Scanner;
public class ch3
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		int score=scn.nextInt();
		if(score>=60)
		{
			System.out.println("及格");
		}
		else if(score<60 && score>=50)
		{
			System.out.println("補考");
		}
		else if(score<50)
		{
			System.out.println("不及格");
		}
	}
}