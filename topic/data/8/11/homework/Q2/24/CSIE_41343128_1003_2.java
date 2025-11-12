import java.util.Scanner;
public class CSIE_41343128_1003_2
{
   public static void main(String[] args)  {
    int a,b,c;
    int max,mid,min;
    Scanner scn=new Scanner(System.in);
    a=scn.nextInt();
    b=scn.nextInt();
    c=scn.nextInt();
    max=(a>b)?((a>c)?a:c):((b>c)?b:c);
    min=(a<b)?((a<c)?a:c):((b<c)?b:c);
    mid=a+b+c-max-min;
    System.out.println(min); 
    System.out.println(mid);
    System.out.println(max);


   }
}
/*
2025/10/03
作者:陳廷鑫
最後編輯時間: 10:27
功能:找出最大值 max, 最小值 min, 以及中間值 mid
*/