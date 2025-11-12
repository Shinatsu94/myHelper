import java.util.Scanner;  
public class CSIE_41343121_1031_2{ 
  public static void main (String args[]){
       Scanner scn=new Scanner(System.in);
       int n=scn.nextInt();
       int a[]=new int[n];
       for(int i=0;i<a.length;i++){
         a[i]=scn.nextInt();
       }
       for(int i=0;i<a.length-1;i++){

          int max=a[i+1];               
          for(int j=i+1;j<a.length;j++){  //找最大值
           if(a[j]>max)max=a[j];
         }
          a[i]=max;
       }
	a[n-1]=-1;
       for(int i=0;i<a.length-1;i++){     //輸出
         System.out.print(a[i]+" ");
       }
       System.out.print(a[n-1]);    
     }
}
//41343121 徐唯祐 
//題目:每一元素出現在它之後的最大值
//日期:10/31