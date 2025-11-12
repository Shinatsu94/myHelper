/* 
   程式名稱:selection sort

   作者:陳韋廷

   日期:2025/10/31

   程式說明:輸入陣列長度後,輸入陣列內容,再用選擇排序排陣列中的內容
*/
import java.util.Scanner;
public class CSIE_41343233_1031_3a{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        char arr[][];
        int n=0;
        n=in.nextInt();
        arr=new char[n][];
        for(int i=0;i<n;i++){
            arr[i]=new char[i+1];
            for(int j=0;j<=i;j++){
                arr[i][j]='*';
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(arr[i][j]);
            }
            System.out.print("\n");
        }
    }
}