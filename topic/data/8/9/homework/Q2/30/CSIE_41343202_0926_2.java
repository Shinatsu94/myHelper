public class CSIE_41343202_0926_2{
	public static void main(String[]args)throws InterruptedException{
	
	char[] spin={'|','/','-','\\'};
	int progress=0;
	int maxProgress=100;
	int step=1;

	while(true){
		int displayProgress=Math.min(progress,maxProgress);
		System.out.print("\r"+spin[progress % spin.length]+" "+displayProgress+"%");
		if(progress<maxProgress){
			progress+=step;
		}
		Thread.sleep(100);
	     }
	}
}
	
