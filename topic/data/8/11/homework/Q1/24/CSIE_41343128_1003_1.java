import java.util.Scanner;
public class CSIE_41343128_1003_1
{
   public static void main(String[] args)  {
    int a,b;
    Scanner scn=new Scanner(System.in);
    a=scn.nextInt();
    b=scn.nextInt();
    a=a^b;
    b=a^b;
    a=a^b;
    System.out.println(a);
    System.out.println(b);

    }
}
/*
2025/10/03
作者:陳廷鑫
最後編輯時間: 10:09
功能:交換變數
*/