import java.util.Scanner;
public class CSIE_41343119_1003_3{
  public static void main(String args[])
    {
     Scanner scn=new Scanner(System.in);
     int a,sum=0,count=0;
     a=scn.nextInt();
     for(int i=0;i<=100000;i++){
        int x=i;
        sum=0;
        while(x>0){
        sum=sum+(x%10);
        x=x/10;
        }
     if(sum==a){count++;}

     }
     System.out.println(count);
 }


}
/*姓名 金宗翰
  學號 41343119
  功能 找尋 1 到 100000之間有多少數字每一個位數的加總結果等於A
  日期 2025/10/03
*/