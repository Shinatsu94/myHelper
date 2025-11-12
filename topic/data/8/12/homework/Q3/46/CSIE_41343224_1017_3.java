/**
 * 程式名稱 : 數字顛倒
 * 
 * 功能說明： 使用者輸入n=ABC，程式輸出CBA
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
 
 public class CSIE_41343224_1017_3{
 
     public static void main(String args[]){
         
         Scanner input = new Scanner(System.in);
         
         int n = input.nextInt();
         
         int count = 0;
         int sum = 0;
         int copy = n;
         while (copy>=1){
             copy/=10;
             count++;
         }
         copy = n;
         while (copy>=1){
             sum+=(copy%10)*Math.pow(10,--count);
             copy/=10;
         }
         System.out.println(sum);
     }
 }