import java.util.Scanner;                 //41343121 徐唯祐 題目:找出數字的大中小 日期:10/3
public class CSIE_41343121_1003_2{ 

  public static void main (String args[]){
    int a,b,c;
    Scanner scn=new Scanner(System.in);
    a=scn.nextInt();
    b=scn.nextInt();
    c=scn.nextInt();
    int max= (a>b?(a>c?a:c):(b>c?b:c));
    int min= (a<b?(a<c?a:c):(b<c?b:c));
    int mid= a+b+c-max-min;
    System.out.println(min);
    System.out.println(mid);
    System.out.println(max);


  }
}