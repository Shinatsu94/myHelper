//功能:旋轉的棒子 姓名:陳家翎
public class CSIE_41343203_0926_2{
	public static void main(String[] args)throws Exception{
		char[] spinner={'|','/','-','\\'};
		int pg=0;
		int maxpg=100;
		int step=2;
		while(true){	
		int displayProgress=Math.min(pg,maxpg);	
		System.out.print("\r"+spinner[pg % spinner.length]+" "+displayProgress+"%");
		if(pg<maxpg){
		pg+=2;
		}
		Thread.sleep(100);
		}
	}
}