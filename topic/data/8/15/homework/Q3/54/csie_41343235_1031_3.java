import java.util.Scanner;
public class csie_41343235_1031_3
{
   public static void main(String arg[])
   {
      Scanner sc=new Scanner(System.in);
      int a,t=20;
      a=sc.nextInt();
      char[][] b=new char[a][];
      for(int i=a-1;i>=0;i--)
      {
         b[i]=new char[t];
         t--;
      }
      t=0;
      for(int i=0;i<a;i++)
      {
         for(int j=0;j<=t;j++)
         {
            b[i][j]='*';
            System.out.print(b[i][j]);          
         }
         t++;
         System.out.print("\n"); 
      }
   }
}