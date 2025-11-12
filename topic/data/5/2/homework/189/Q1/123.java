// app5_7, 巢狀 for 迴圈球 9*9 乘法表
public class app5_7
{
	public static void main(String args[])
	{
		int i,j;

		for (i=1;i<=9;i++)  // 外層迴圈
		{
			for (j=1;j<=9;j++)  // 內層迴圈
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			System.out.println();
		}
	}
}
