import java.util.Scanner;
public class CSIE_41343121_1031_3a{
 public static void main (String args[]){
    Scanner scn = new Scanner(System.in);
    int n=scn.nextInt();
    for(int i=n;i>0;i--){        
     for(int j=0;j<=n-i;j++){
       System.out.printf("*");
     }
     System.out.printf("\n");
   }




 }
}
//41343121 徐唯祐 
//題目:以'*'符號顯示三角形
//日期:10/31