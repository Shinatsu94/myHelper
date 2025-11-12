import java.util.Scanner;
public class CSIE_41343232_3_0926{
	public static void main(String[] args){
	  Scanner scn=new Scanner(System.in);
	  System.out.print("輸入你的成績 ");
	  int grade=scn.nextInt();
	  if(grade>=60)
	    System.out.print("及格");
	  else if(grade<60 && grade>=50)
	    System.out.print("需補考");
	  else
	    System.out.print("不及格");
	 scn.close();
	}
}
	  