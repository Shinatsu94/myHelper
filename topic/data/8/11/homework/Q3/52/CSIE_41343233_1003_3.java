/*檔案名稱:CSIE_41343233_1003_3
  日期:2025/10/03
  作者:陳韋廷
  程式介紹:輸入一個數A,找1到100000之間有多少數字每一個位數的加總等於A
*/
import java.util.Scanner;
public class CSIE_41343233_1003_3{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int sum=0,number=0,fre=0;
        int A=scn.nextInt();
        for(int i=1;i<=100000;i++){
            sum=0;
            number=i;
            while(number!=0){
                sum=sum+(number%10);
                number=number/10;
            }
            if(sum==A) fre++;
        }
        System.out.print(fre);            
    }
}