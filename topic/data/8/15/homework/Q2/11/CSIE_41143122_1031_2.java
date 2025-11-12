//package h4w;
import java.util.Scanner;
/*
    filename: CSIE_41143122_1031_2.java
    function: 讀入使用者輸入的任意長度一維陣列(, 使用者先輸入陣列長度，然後逐一輸入陣列內容)，
                程式將陣列每一元素置換為出現在它之後的最大值(, 陣列最後一個元素直接替換為-1), 並將此陣列印出
      author: 林柏儒 資工四甲 41143122
    datetime: 2025/10/31
     version: 1.0
*/
public class CSIE_41143122_1031_2 {
    public static void ReplaceElements(int array[]){
        int max=0;
        for(int j=0;j<array.length-1;j++){
            for(int i=j+1;i<array.length;i++){
                if(i==j+1){
                    max=array[i];
                }
                if(array[i]>max){
                    max=array[i];
                }
            }//System.out.println("max="+max);
            array[j]=max;
        }array[array.length-1]=-1;
        for(int i=0;i<array.length;i++){
            if(i==array.length-1)
                System.out.print(array[i]);
            else
                System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        //System.out.printf("請輸入n：");
        int n = scanner.nextInt();
        int []array=new int[n];
        //System.out.println("n="+n);
        for(int i=0;i<n;i++){
            array[i] = scanner.nextInt();
        }
        //System.out.println("");
        /*for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("");*/
        ReplaceElements(array);
        scanner.close();
    }
}
