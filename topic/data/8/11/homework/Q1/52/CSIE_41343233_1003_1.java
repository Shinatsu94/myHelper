/*檔案名稱:class csie_41343233_1003_1
  日期:2025/10/03
  作者:陳韋廷
  程式介紹:輸入a跟b的值,後交換a跟b的值
*/
import java.util.Scanner;
public class csie_41343233_1003_1{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);
    }
}