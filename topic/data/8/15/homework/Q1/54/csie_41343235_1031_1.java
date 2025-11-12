import java.util.Scanner;
public class csie_41343235_1031_1
{
   public static void main(String arg[])
   {
      Scanner sc=new Scanner(System.in);
      int a,t=0;
      int []b;
      a=sc.nextInt();
      b=new int[a];
      for(int i=0;i<a;i++)
         b[i]=sc.nextInt();
      int min;
      for(int i=0;i<a-1;i++)
      {
         min=i;
         for(int j=i+1;j<a;j++)
            if(b[j]<b[min])
               min=j;
            t=b[i];
            b[i]=b[min];
            b[min]=t;
      }
      for(int i=0;i<a;i++)
      {
         if(i==a-1)
          System.out.print(b[i]);
         else
          System.out.print(b[i]+" ");
      }
   }
}