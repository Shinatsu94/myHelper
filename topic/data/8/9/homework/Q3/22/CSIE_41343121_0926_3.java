import java.util.Scanner;                 //徐唯祐 題目:成績判斷 日期:9/26
public class CSIE_41343121_0926_3{
  public static void main (String args[]){
    int a;
    while(true) {
     Scanner scn = new Scanner(System.in); 
     a=scn.nextInt();                      //輸入成績
     if(a>60){                             //判斷成績
     System.out.println("及格");             
     }
     if(a<60 && a>=50){
     System.out.println("補考"); 
     }
     if(a<50){
     System.out.println("不及格"); 
     }
    }
  }
}