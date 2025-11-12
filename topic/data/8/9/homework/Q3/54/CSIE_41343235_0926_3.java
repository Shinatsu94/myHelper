//檔案名稱:CSIE_41343235_0926_1 學號:41343235 姓名:曾偉傑
//結果會判斷你輸入的成績是否及格
import java.util.Scanner;
public class CSIE_41343235_0926_3{
   public static void main(String[] args) throws Exception{
      Scanner sca = new Scanner(System.in);
      System.out.print("請輸入您的成績:");
      int score=sca.nextInt();
      if(score>=60)
          System.out.println("及格!!");
      else if(score>=50)
          System.out.println("需要補考!!");
      else
         System.out.println("不及格!!");
   }
}
