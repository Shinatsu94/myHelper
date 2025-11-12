/*
Name:盧冠宇
Student_ID:41343247
*/
public class CSIE_41343247_0926_2{
	public static void main(String[] args)throws Exception{
		int n=10;
		while(n<=100){
			System.out.print("\r"+"\\ "+n+"%");
			Thread.sleep(100);
			System.out.print("\r"+"| "+n+"%");
			Thread.sleep(100);
			System.out.print("\r"+"/ "+n+"%");
			Thread.sleep(100);
			System.out.print("\r"+"- "+n+"%");
			Thread.sleep(100);
			n+=2;
		}
	}
}