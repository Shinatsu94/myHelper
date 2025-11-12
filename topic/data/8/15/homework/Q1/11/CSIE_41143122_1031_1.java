//package h4w;
import java.util.Scanner;
/*
    filename: CSIE_41143122_1031_1.java
    function: 讀入使用者輸入的任意長度一維陣列(, 使用者先輸入陣列長度，然後逐一輸入陣列內容)，程式可以輸出 selection sort 排序前後陣列的內容
      author: 林柏儒 資工四甲 41143122
    datetime: 2025/10/31
     version: 1.0
*/
public class CSIE_41143122_1031_1 {
    public static void selectionSort(int array[]){
        int min=0,flag=0;
        for(int j=0;j<array.length-1;j++){
            for(int i=j;i<array.length;i++){
                if(i==j){
                    min=array[i];
                    flag=i;
                }    
                else{   
                    if(array[i]<min){
                        min=array[i];
                        flag=i;
                    }
                }
            }//System.out.println("min="+min);
            int temp=array[j];
            array[j]=array[flag];
            array[flag]=temp;
        }
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
        selectionSort(array);
        scanner.close();
    }
}
