import java.util.Scanner;
public class csie_41343234_1003_2
{
   public static void main(String args[])
   {
      int max,min,mid;
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      max=(a>b)&&(a>c)?a:(b>c)?b:c;
      min=(a<b)&&(a<c)?a:(b<c)?b:c;
      mid=a+b+c-max-min;
      System.out.println(min);
      System.out.println(mid);
      System.out.print(max);
   }
}