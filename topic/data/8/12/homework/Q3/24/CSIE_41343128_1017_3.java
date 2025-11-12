import java.util.Scanner;
public class CSIE_41343128_1017_3 {
    public static void main (String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=0;  //n為使用者輸入,a為目前位數判斷	
        n=scn.nextInt();// 讀取
	 while (n > 0) {
            int digit = n % 10;         // 取得最低位
	    if(digit!=0)
            System.out.printf("%d", digit); // 印出
            n = n / 10;                 // 去掉最低位
          
         }
     }	
}
/*
2025/10/17
作者:陳廷鑫
最後編輯時間: 10:51
功能:reverse digit 
*/