/**
 * 程式名稱: 成績判斷
 * 功能: 輸入成績，並且根據成績判斷是否為及格、補考、不及格
 * 學號: 41343252
 * 日期: 2025/09/26
 */
import java.util.Scanner;
public class CSIE_41343252_0926_3
{
	public static void main(String[] args)
	{
		while(true)
		{
			Scanner in = new Scanner(System.in);
			int x=in.nextInt();
			if(x>=60)
			{
				System.out.println("及格");
			}
			else if(x>=50&&x<60)
			{
				System.out.println("補考");
			}
			else
			{
				System.out.println("不及格");
			}
		}
    	}
}