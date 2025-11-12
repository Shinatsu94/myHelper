//檔案名稱:CSIE_41343235_0926_1 學號:41343235 姓名:曾偉傑
//結果會輸出進度條及進度%數
public class CSIE_41343235_0926_2{
   public static void main(String[] args) throws Exception{
      for(int i=0;i<10;i++){
         System.out.print("\r|");
         Thread.sleep(100);

         System.out.print("\r/");
         Thread.sleep(100);

         System.out.print("\r-");
         Thread.sleep(100);

         System.out.print("\r\\");
         Thread.sleep(100);
         if(i==0)
            System.out.print("0%");
         else if(i==1)
	    System.out.print("20%");
         else if(i==4)
            System.out.print("50%");
         else if(i==6)
            System.out.print("70%");
         else if(i==9)
            System.out.print("100%");
      }
      System.out.print("進度完成!!");
   }
}
