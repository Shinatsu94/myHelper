public class CSIE_41245139_0926_2{
   public static void main(String[] args) throws Exception {
      char spin[]={'|','/','-','\\'};
      int i=0;
      while (true) {
         System.out.print("\r" + spin[i % spin.length]) ;
         Thread.sleep(100);
         i++ ;
    }
  }
}