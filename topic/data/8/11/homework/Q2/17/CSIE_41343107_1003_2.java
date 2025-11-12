import java.util.Scanner;
public class CSIE_41343107_1003_2
{
	public static void main(String args[])
	{
	Scanner same=new Scanner(System.in);
	int a,b,c;
	int  max,min,mid;
	a = same.nextInt();
        b = same.nextInt();
	c = same.nextInt();
	max=(a>b)?((a>c)?a:c):((b>c)?b:c);
	min=(a<b)?((a<c)?a:c):((b<c)?b:c);
	mid=a+b+c-max-min;
	System.out.println(min);
	System.out.println(mid);
	System.out.println(max);
	}
} 
/*
 姓名: 王世豪
 學號: 41343107
 功能: 找大小
 日期: 2025/09/26
*/