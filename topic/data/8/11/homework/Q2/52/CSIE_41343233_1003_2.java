/*檔案名稱:class csie_41343233_1003_2
  日期:2025/10/03
  作者:陳韋廷
  程式介紹:輸入a和b跟c的值,找出最大值與中間值跟最小值
*/
import java.util.Scanner;
public class csie_41343233_1003_2{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int max=0,min=0,mid=0;
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();
        max=a>b?a:b;
        max=c>max?c:max;
        min=a<b?a:b;
        min=c<min?c:min;
        mid=a+b+c-max-min;
        System.out.println(min);
        System.out.println(mid);
        System.out.print(max);
    }
}