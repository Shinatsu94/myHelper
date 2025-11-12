import java.util.Scanner;
public class csie_41343235_1017_2
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int[] m=new int[3];
      m[0]=a/100;
      m[1]=(a/10)%10;
      m[2]=a%10;
      if((m[0]>m[1])&&(m[1]>m[2])||(m[0]<m[1])&&(m[1]<m[2]))
         System.out.printf(a+" is well-ordered number.");
      else
         System.out.printf(a+" is not well-ordered number.");
   }
}