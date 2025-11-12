import java.util.Scanner;
public class CSIE_41343119_1031_1{
  public static void main(String args[])
    
{
    Scanner scn=new Scanner(System.in); 
    int n;
    n=scn.nextInt();
    int[] A = new int[n];

    for(int i=0;i<n;i++){
           A[i]=scn.nextInt();
    }
    for(int i=0;i<n;i++){
       for(int j=i+1;j<n;j++){
          int temp;
          if(A[j]<A[i]){
            temp=A[j];
            A[j]=A[i];
            A[i]=temp;
          }
       }
    }
    for(int i=0;i<n-1;i++){
           System.out.printf(A[i]+" ");
    }
    System.out.println(A[n-1]);
}
}
/*姓名 金宗翰
  學號 41343119
  功能 輸出 selection sort 排序前後陣列的內容
  日期 2025/10/31
*/