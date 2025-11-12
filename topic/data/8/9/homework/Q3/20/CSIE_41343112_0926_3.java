import java.util.Scanner;
public class CSIE_41343112_0926_3{//41343112 李宗懌 日期:0926 題目:成績判斷
public static void main(String[] args){
Scanner scn=new Scanner(System.in);
int a;

a=scn.nextInt();//輸入成績
if(a>=60)System.out.println("及格");//__
else if(a<60 && a>=50)//                | 
System.out.println("補考");//           | 成績判斷
else System.out.println("不及格");//  --|
}
}