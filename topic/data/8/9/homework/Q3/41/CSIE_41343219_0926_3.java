import java.util.Scanner;

public class CSIE_41343219_0926_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // 輸入物件
        int score=scan.nextInt(); // 接收使用者輸入的分數
        if(score>100||score<0) ; // 錯誤分數，不執行
        else if(score<50) System.out.println("不及格"); // 50 > score：不及格
        else if(score<=60) System.out.println("補考"); // 60 > score >= 50：補考
        else System.out.println("及格"); // score >= 60 : 及格
        scan.close();
    }
}
