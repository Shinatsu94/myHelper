import java.util.Scanner;
public class CSIE_41343128_0926_3
{
   public static void main(String[] args)  {
       Scanner scn=new Scanner(System.in);
       int score;
       while(true){
       System.out.print("輸入成績:");    
       score=scn.nextInt();
	 
          if(score>=60){
	      System.out.println("及格");
	  	 }
          else if(score>=50&&score<60){
	      System.out.println("補考");
	      }
	  else {
	      System.out.println("不及格");
	      }
	}

     }
}