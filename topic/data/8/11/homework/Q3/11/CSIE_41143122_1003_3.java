//package h4w;
import java.util.Scanner;
/*
    filename: CSIE_41143122_1003_3.java
    function: 範圍內找出符合輸入的位數和的數量（範圍1~10W）
      author: 林柏儒 資工四甲 41143122
    datetime: 2025/10/3
     version: 1.0
*/
public class CSIE_41143122_1003_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //System.out.printf("請輸入位數和：");
        int scn = scanner.nextInt();
        //System.out.println("scn="+scn);
        int token=0;
        for(int i=1;i<=100000;i++){
            int sum=0;
            int temp=i;
            while(temp>0){
                sum=sum+temp%10;
                temp=temp/10;
            }
            if(sum==scn){
                token=token+1;
                //System.out.println("i="+i);
            }
        }
        //System.out.println("token="+token);
        System.out.println(token);
    }
}
