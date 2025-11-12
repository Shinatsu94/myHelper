import java.util.Scanner;
public class CSIE_41343143_0926_3{
	public static void main(String[] args){
	System.out.print("輸入成績:");
	Scanner scn=new Scanner(System.in);
	int score=scn.nextInt();
	if(score>=60)
 	System.out.print("及格");
	if(score<60 && score>=50)
 	System.out.print("補考");
	if(score<50)
 	System.out.print("不及格");
	scn.close();
	}
}