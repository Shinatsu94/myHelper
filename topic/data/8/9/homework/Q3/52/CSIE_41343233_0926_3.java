/*檔案名稱:CSIE_41343233_0926_3
  作者:陳韋廷
  日期:09/26
  程式說明:輸入分數,並判斷及格 補考 不及格
*/
import java.util.Scanner;
public class CSIE_41343233_0926_3{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.print("輸入分數:");
        int score=scn.nextInt();
        if(score>=60)
            System.out.println("及格");          
        else if(score>=50)
            System.out.println("補考");
        else
            System.out.println("不及格");
    }
}