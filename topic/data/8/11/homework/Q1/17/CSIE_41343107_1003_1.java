import java.util.Scanner;
public class CSIE_41343107_1003_1
{
	public static void main(String args[])
	{
	Scanner same=new Scanner(System.in);
	int a;
	int b;
 	a = same.nextInt();
        b = same.nextInt();
	a = a ^ b;
        b = a ^ b;
        a = a ^ b;
	System.out.println(a);
	System.out.println(b);
	}
} 
/*
 姓名: 王世豪
 學號: 41343107
 功能: 數值交換
 日期: 2025/09/26
*/