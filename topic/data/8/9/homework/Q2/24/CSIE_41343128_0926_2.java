/*
2025/09/26
作者:陳廷鑫
最後編輯時間: 11:03
功能:顯示進度
*/

public class CSIE_41343128_0926_2
{

   public static void main(String[] args) throws Exception {
       char a='\\';
       char b='|';
       char c='-';
       char d='/';

       for(int i=0;i<=100;i+=5) {
	     System.out.print("\r"+a+"載入進度:"+i+"%");
	     
             Thread.sleep(130);
             System.out.print("\r"+b+"載入進度:"+i+"%");
	     Thread.sleep(200);
             System.out.print("\r"+c+"載入進度:"+i+"%");
	     Thread.sleep(150);
             System.out.print("\r"+d+"載入進度:"+i+"%");
	     Thread.sleep(100);
             System.out.print("\r");

       }
           System.out.print("\r載入完成           ");

    }
}