import java.util.Scanner;
public class CSIE_41343109_0926_3{//學號41343109 姓名:吳育丞 功能判斷有沒有及格 日期:2025/0926

	public static void main(){
		Scanner scn=new Scanner(System.in);
		int a;
		a=scn.nextInt();
		if(a<50)System.out.print("不及格");
		if(a>=60)System.out.print("及格");
		if(a<60&&a>=50)System.out.print("補考");
	}
}