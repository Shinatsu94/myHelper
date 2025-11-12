
public class CSIE_41343222_0926_2{
	public static void main(String[] args)throws Exception{
		int time=0;
		while(time<=100){
			System.out.print("\r/");
			Thread.sleep(250);
			System.out.print("\r|");
			Thread.sleep(250);
			System.out.print("\r\\");
			Thread.sleep(250);
			System.out.print("\r-");
			Thread.sleep(250);
			time++;
			System.out.print(""+time+"%");
		}
	}
}