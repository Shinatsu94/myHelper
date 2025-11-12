import java.util.Scanner;
public class CSIE_41343107_1017_2
{
	public static void main(String args[])
	{
	Scanner same=new Scanner(System.in);
	int n=same.nextInt();
	int a=1;
	int b=n%10;
	for(int i=n/10;i>0;i=i/10){
		if(b<=i%10) a=0;
		b=i%10;
	}
	if(a==1) System.out.println(n+"is well-ordered number.");
	else	System.out.println(n+"is not well-ordered number.");

	}
} 
/*
 姓名: 王世豪
 學號: 41343107
 功能: well-ordered number
 日期: 2025/10/17
*/