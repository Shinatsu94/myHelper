import java.util.Scanner;
public class CSIE_41343107_1017_3
{
	public static void main(String args[])
	{
	Scanner same=new Scanner(System.in);
	int n=same.nextInt();
	int sum=0; 
	for(int i=n;i>0;i=i/10){
		sum=sum*10+i%10;
		}
	System.out.println(sum);
	}
} 
/*
 姓名: 王世豪
 學號: 41343107
 功能: reverse digit order of an integer given by the user.
 日期: 2025/10/17
*/