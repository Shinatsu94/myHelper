import java.util.Scanner;
public class csie_41343235_1017_3
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int con=0,b=a;
      while(b>0)
      {
         b=b/10;
         con++;
      }
      int[] m=new int[4] ;
      m[0]=a/1000;
      m[1]=(a/100)%10;
      m[2]=(a/10)%10;
      m[3]=a%10;
         if(((m[1]==0)&&(m[2]==0)&&(m[3]==0)))
            System.out.print(m[0]);
         else if((m[2]==0&&m[3]==0))
            for(int i=1;i>=0;i--)
            {
               System.out.print(m[i]);
            }
         else if(m[3]==0)
            for(int i=2;i>=0;i--)
            {
               System.out.print(m[i]);
            }
         else if(a<10)
             System.out.print(a);
         else
            for(int i=3;i>=0;i--)
            {
               if(a<1000&&a>100&&i==0)
                  break;
               if(a<100&&a>10&&i==0)
                  break;
               if(a<100&&a>10&&i==1)
                  break;          
               System.out.print(m[i]);
            }
   } 
}