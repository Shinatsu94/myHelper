/**
 * 程式名稱 : 是不是well-ordered
 * 
 * 功能說明： 使用者輸入n=ABC,是否是A>B>C
 *
 * 日期:2025/10/03
 *
 * 姓名:張竣傑
 *	
 * 學號:41343224
 * 
 * 請給我100分!!
 */
 import java.util.Scanner;
 
 public class CSIE_41343224_1017_2{
 
     public static void main(String args[]){
         
         Scanner input = new Scanner(System.in);
         
         int n = input.nextInt();
         
         boolean judge = true;
         int temp1 = 0,temp2 = 0;
         int copy = n;
         while (copy>1){
             temp1 = copy%10;
	     copy/=10;
             temp2 = copy%10;
	     copy/=10;
             if (temp1<= temp2)
              judge = false;
         }
         if(judge)
            System.out.println(n+" is well-ordered number.");
	 else
            System.out.println(n+" is not well-ordered number.");
     }
 }