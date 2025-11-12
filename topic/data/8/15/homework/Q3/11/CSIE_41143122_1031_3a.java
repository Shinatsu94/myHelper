//package h4w;
import java.util.Scanner;
/*
    filename: CSIE_41143122_1031_3a.java
    function: 建立一個下三角形二維陣列，高度 n 由使用者輸入，其中 0<n<=20，寫一程式將此三角形以'*'符號顯示在銀幕。
      author: 林柏儒 資工四甲 41143122
    datetime: 2025/10/31
     version: 1.0
*/
public class CSIE_41143122_1031_3a {
    public static void triangle(int n){
        char[][]array=new char[n][];
        for(int j=0;j<n;j++){
            array[j] = new char[j + 1];
            for(int i=0;i<j+1;i++){
                array[j][i] = '*';
            }
        }
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < array[j].length; i++) {
                System.out.print(array[j][i]);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        //System.out.printf("請輸入n：");
        int n = scanner.nextInt();
        //System.out.println("n="+n);
        triangle(n);
        scanner.close();
    }
}
