import java.util.Scanner;
public class CSIE_41343150_1031_3b{
 public static void main (String args[]){
    Scanner scn = new Scanner(System.in);
    int n=scn.nextInt();
    int tar=scn.nextInt();
    int a=0;
    int old=0;
    for(int i=1;i<=n;i++){
    a+=i;
    if(tar<=a){
    System.out.printf("%d[%d, %d]",tar,i,tar-old);
     break;
    }
    else if(i==n)System.out.printf("not find %d in array.",tar);
    old=a;
   }




 }
}
//題目:數字出現在三角形的位置 
//日期:10/31