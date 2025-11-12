/* 
   程式名稱:找出某數在何處

   作者:陳韋廷

   日期:2025/10/31

   程式說明:輸入n決定三角形的高度,再輸入要搜尋的數值,找出輸入的數值在陣列中的哪個位址
*/
import java.util.Scanner;
public class CSIE_41343233_1031_3b{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=0,s=0,num=0,a=-1,b=0;
        n=in.nextInt();
        s=in.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                num++;
                //System.out.print(num);
                if(num==s){
                a=i;b=j;
                break;
                }
            }
            //System.out.print("\n");
        }
        if(a==-1)
            System.out.printf("not find %d in array.",s);
        else
            System.out.printf("%d[%d, %d]",s,a+1,b+1);
    }
}