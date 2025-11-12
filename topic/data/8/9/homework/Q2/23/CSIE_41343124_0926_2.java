public class CSIE_41343124_0926_2{
	public static void main(String[] args)  throws Exception {
		char i='\r';
		int a=0;
	        while(a<=100) {

        	System.out.print(i+"/");
		System.out.print(a+"%");
		a+=10;
		if (a>=100)break;
		 Thread.sleep(100);
		System.out.print(i+"-");
 		Thread.sleep(100);
		System.out.print(i+"\\");
		System.out.print(a+"%");
		a+=10;
		 Thread.sleep(100);
		System.out.print(i+"|");
		 Thread.sleep(100);
		}	

       }

    }