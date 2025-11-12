import java.util.Scanner;
public class CSIE_41343128_1017_2 {
    public static void main (String[] args) {
        boolean flag = true;  //控制
	Scanner scn=new Scanner(System.in);
	int n,a,temp;  //n為使用者輸入,a為目前位數判斷,temp儲存資料用於輸出
	n=scn.nextInt();// 讀取
	temp=n;
	while(n>0){
	flag = true;  //控制
	a=n%10;  // 取得個位數
	n=n/10; // 去掉個位數
	if(a>n%10)
	flag = true; 
	else{
 	flag = false; 
	break;  // 可直接結束判斷
	}
	}
	if(flag)
            System.out.printf(temp+" is well-ordered number."); // 根據 flag 的結果印出是否為 well-ordered number

	else
 	    System.out.printf(temp+" is not well-ordered number."); // 根據 flag 的結果印出是否為 well-ordered number
       }
}
/*
2025/10/17
作者:陳廷鑫
最後編輯時間: 10:36
功能:well-ordered number 
*/