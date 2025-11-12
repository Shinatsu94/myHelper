//package h4w;
import java.util.Scanner;
/*
    filename: CSIE_41143122_1031_3b.java
    function: 將數字 1, 2, 3, .... 依照由上到下，由左到右的順序填入一個下三角形矩陣(與(a)的三角形無關)，使用者可以輸入一個特定數 num<100000 ，
                寫一程式找到此數字出現在此下三角形的位置，印出此數字與此位置的列編號和行編號，但不用印出三角形內容。
      author: 林柏儒 資工四甲 41143122
    datetime: 2025/10/31
     version: 1.0
*/
public class CSIE_41143122_1031_3b {
    public static void triangle(int n,int m){
        int i,j,temp=0,flag=0;
        int[][]array=new int[n][];
        for(j=0;j<n;j++){
            array[j] = new int[j + 1];
            for(i=0;i<j+1;i++){
                temp++;
                array[j][i] = temp;
                if(temp==m){
                    flag=1;
                    System.out.print(m+"["+(i+1)+","+(j+1)+"]");
                }
            }
        }
        if(flag==0){
            System.out.println("not find "+m+" in array.");
        }
        /*System.out.println("");
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < array[x].length; y++) {
                System.out.print(array[x][y]+" ");
            }
            System.out.println("");
        }*/
    }
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        //System.out.printf("請輸入n：");
        int n = scanner.nextInt();
        //System.out.println("n="+n);
        //System.out.printf("請輸入m：");
        int m = scanner.nextInt();
        //System.out.println("m="+m);
        triangle(n,m);
        scanner.close();
    }
}
