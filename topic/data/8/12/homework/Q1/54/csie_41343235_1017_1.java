public class csie_41343235_1017_1
{
   public static void main(String[] args)
   {
      double pi=0.0,pi1=0;
      for(int i=10000;i<=100000;i+=10000)
      {
         for(int j=1;j<=i;j++)
         {
            if((j%2)==0)
               pi=pi-1/(double)(2*j-1);
            else
               pi=pi+1/(double)(2*j-1);
         }
         pi*=4;
         System.out.println(String.format("i = %6d, pi = %.10f", i, pi));
         pi=0;
         }
pi=0;
            int j=1;
         while(true)
         {
            if((j%2)==0)
               pi=pi-1/(double)(2*j-1);
            else
               pi=pi+1/(double)(2*j-1);
            pi1=pi*4;
            pi1=Math.floor(pi1*Math.pow(10,5))/Math.pow(10,5);
            if(pi1==3.14159)
            {
             
                System.out.println(String.format("\ni = %6d", j));
                break;
            }
            j++;
         }

   }
}