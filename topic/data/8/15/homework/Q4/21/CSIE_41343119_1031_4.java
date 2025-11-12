import java.util.Scanner;
public class CSIE_41343119_1031_4{
  public static void main(String args[])
    
{
    Scanner scn=new Scanner(System.in); 
    int n,t,k=1,sum=0;
    n=scn.nextInt();
    t=scn.nextInt();
    for(int i=1;i<=n;i++){
       
       for(int j=0;j<k;j++){
          sum++;
          if(sum==t){
            System.out.printf(t+"["+i+", "+(j+1)+"]");
            break;
          }

       }
       k++;
       if(sum==t)break;
     }
       if(sum!=t)System.out.printf("not find "+t+" in array.");;

}
}
/*姓名 金宗翰
  學號 41343119
  功能 讓使用者輸入一個要尋找的數字 (num < 100000)。
       建立完整的下三角形二維陣列 (不用印出三角形內容)。
       找出 num 在陣列中的位置（列編號和行編號，皆從 1 開始），並將其印出。
       如果 num 超出陣列範圍，則印出相應的提示訊息。
  日期 2025/10/31
*/