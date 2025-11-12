import java.util.Scanner;                 
public class CSIE_41343121_1003_3{ 
  public static void main (String args[]){
    int a,com=0;
    Scanner scn=new Scanner(System.in);
    a=scn.nextInt();
    for(int i=0;i<=100000;i++){
      int sum=0,b=i;
      while(b!=0){
       sum+=(b%10);
       b/=10;
      }
      if(sum==a)
      com++;
    }  
   System.out.println(com);
  }
}