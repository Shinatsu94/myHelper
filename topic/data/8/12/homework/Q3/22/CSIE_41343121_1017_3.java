import java.util.Scanner;                 
public class CSIE_41343121_1017_3{ 
  public static void main (String args[]){
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int a=0;
    while(n !=0){
    int b=n%10;
    a=a*10+b;
    n=n/10;
    }
   System.out.println(a);
  }
}