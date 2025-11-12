import java.util.Scanner;
public class CSIE_41245139_0926_3{
   public static void main(String[] args){
      Scanner sca=new Scanner(System.in);
      System.out.print("請輸入分數:");
      int score=sca.nextInt();
      if(score>=60){
         System.out.println("及格");
      } else if (score >= 50) {
            System.out.println("補考");
      } else {
            System.out.println("不及格");
      }
      sca.close();
  }
}
