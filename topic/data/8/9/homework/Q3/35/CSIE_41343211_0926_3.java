import java.util.Scanner;

public class csie_0926_41343211_03{
  public static void main(String[] args){
   Scanner scn=new Scanner(System.in);
   System.out.print("a= ");
   int a=scn.nextInt();
   
   
   if(a>=60){
       System.out.println("及格");
     }
   else if((a>=50) && (a<60) ){
       System.out.println("補考");
     }
   else{

       System.out.println("不及格");
     }
   
   



   }



}