import java.util.Scanner;
public class CSIE_41343223_0926_3 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);//建立Scanner類別

        System.out.println("請輸入成績:");
        
        int score=scn.nextInt();//輸入成績(整數)
        if(score>=60) {//判斷分數
            System.out.println("及格");
        } else if(score >= 50) {
            System.out.println("補考");
        } else {
            System.out.println("不及格");
        }
        scn.close();//結束scn
    }
}