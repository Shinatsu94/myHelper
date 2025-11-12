import java.util.Scanner;  
public class CSIE_41343121_1031_1{ 
  public static void main (String args[]){
       Scanner scn=new Scanner(System.in);
       int n=scn.nextInt();
       int a[]=new int[n];
       for(int i=0;i<a.length;i++){
         a[i]=scn.nextInt();
       }
       for(int j=0;j<a.length;j++){     //泡沫排序法
          for(int k=j+1;k<a.length;k++){
          if(a[j]>a[k]){
           int b =a[j];
               a[j]=a[k];
               a[k]= b;
          }
         }
       }
       for(int i=0;i<a.length-1;i++){
         System.out.print(a[i]+" ");
       }
       System.out.print(a[n-1]);      
     }
}
//41343121 徐唯祐 
//題目:排序陣列
//日期:10/31