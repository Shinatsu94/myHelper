
public class RoBar{
	public static void main(String[] args)throws InterruptedException{
		
		char[] spin={'|','/','-','\\'};//顯示的字元有哪幾種
		int i=0;
	long end=System.currentTimeMillis()+10_000;//運行時間設定為10秒
	while (System.currentTimeMillis()<end){
	System.out.print("\r"+spin[i%spin.length]+i+"%");//顯示運行動畫跟時間進度
	System.out.flush();
	Thread.sleep(100);//暫停0.1秒
	i++;
	
	}	
	System.out.println();

}
}