public class chrTwo{
	public static void main(String[] args)throws InterruptedException{

       		char[]  s= {'|' , '/' , '-' ,'\\'};
		int i = 0 ;

		long end = System.currentTimeMillis()+10_000; // 執行時間 10s

        	while(System.currentTimeMillis() < end) {
		System.out.print("\r" + s[i%s.length] + i +"%"); // 棒子的動畫
		System.out.flush();
		Thread.sleep(100); //暫 1s
	
		i += 1;

       }
	System.out.println();

    }
}