import java.util.Scanner;                 //41343121 徐唯祐 題目:a、b交換 日期:10/3
public class CSIE_41343121_1003_1{ 

  public static void main (String args[]){
    int a,b;
    Scanner scn=new Scanner(System.in);
    a=scn.nextInt();
    b=scn.nextInt();
    //System.out.println(a);
   // System.out.println(b);
    a=a^b;
    b=a^b;
    a=a^b;
    System.out.println(a);
    System.out.println(b);
  }
}