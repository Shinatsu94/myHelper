public class  CSIE_41343232_2_0926 {
    public static void main(String[] args) throws Exception {
	 int i = 0; 
        while(i<=100) {
	  System.out.print("\r|..."+i+"%");
	  Thread.sleep(100);
	  
	  System.out.print("\r/..."+i+"%");
	  Thread.sleep(100);

	  System.out.print("\r-..."+i+"%");
	  Thread.sleep(100);

	  System.out.print("\r\\..."+i+"%");
	  Thread.sleep(100);
          i+=1;
	}
    }
}
