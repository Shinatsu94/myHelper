public class csie_0926_41343211_02{
  public static void main(String[] args) throws Exception{
    int a=0;
    char b='\\';
    char c='|';
    char d='/';
    char e='-';

    while(a<=100){
      System.out.print("\r"+b);
  
      
      Thread.sleep(100);
      System.out.print("\r"+c);
  
      
      Thread.sleep(100);

      System.out.print("\r"+d);
  
     
      Thread.sleep(100);

      System.out.print("\r"+e);
  
      
      Thread.sleep(100);
      System.out.print(a+"%");
      
     

      a+=10;
      Thread.sleep(1000);
     }


   }






}