import java.util.Scanner;                 
public class CSIE_41343121_1017_2{ 
  public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int j=a%10;
    boolean state=true;
    for(int i=a/10;i>0;i=i/10){
     if(j<=i%10)state=false;
     j=i%10;
    }
    if(state)System.out.println(a+" is well-ordered number.");
    else System.out.println(a+" is not well-ordered number.");
  }
}