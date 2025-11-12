import java.util.Scanner;
public class CSIE_41343119_1031_2{
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
       if(i<n-1)A[i]=A[i+1];
       for(int j=i+1;j<n;j++){      
          if(A[j]>A[i]){
            A[i]=A[j];
          }
       }
    }
    A[n-1]=-1;
    for(int i=0;i<n-1;i++){
           System.out.printf(A[i]+" ");
    }
    System.out.println(A[n-1]);

}
}
/*姓名 金宗翰
  學號 41343119
  功能 將陣列每一位元置換為出現在它之後的元素最大值 (陣列最後一個元素替換為-1)
  日期 2025/10/31
*/