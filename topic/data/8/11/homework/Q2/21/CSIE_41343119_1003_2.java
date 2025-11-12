import java.util.Scanner;
public class CSIE_41343119_1003_2{
  public static void main(String args[])
    {
     Scanner scn=new Scanner(System.in);
     int a,b,c,max,min;
     a = scn.nextInt();
     b = scn.nextInt();
     c = scn.nextInt();
     max=(a>b)?((a>c)?a:c):((b>c)?b:c);
     min=(a<b)?((a<c)?a:c):((b<c)?b:c);
     System.out.println(min);
     System.out.println((a+b+c-max-min));
     System.out.println(max);
         }


}
/*姓名 金宗翰
  學號 41343119
  功能 判斷大小
  日期 2025/10/03
*/