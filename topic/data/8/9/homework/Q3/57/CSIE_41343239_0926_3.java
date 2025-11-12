import java.util.Scanner;
public class CSIE_41343239_0926_3{
   public static void main(String[] args){
          Scanner sca= new Scanner(System.in);
          System.out.print("請輸入你的成績:");
	  int score=sca.nextInt();
	  if(score>=60)
	   System.out.print("及格!");
	  else if(score>=50)
	   System.out.print("補考!");
	  else 
	   System.out.print("不及格!");
   }
}