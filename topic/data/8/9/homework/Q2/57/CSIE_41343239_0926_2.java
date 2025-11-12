public class CSIE_41343239_0926_2{
   public static void main(String[] args) throws Exception{
	for(int i=1;i<=10;i++){
	  System.out.print("\r|");
	  Thread.sleep(100);  //¥ð®§0.1¬í
	  System.out.print("\r/");
	  Thread.sleep(100);
	  System.out.print("\r-");
	  Thread.sleep(100);
	  System.out.print("\r\\");
	  Thread.sleep(100);
          System.out.print(i*10+"%");//Åã¥Ü10%¡B20%....
      }
   }
}