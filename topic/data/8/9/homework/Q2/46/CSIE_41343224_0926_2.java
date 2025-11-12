/**
 * 程式名稱 : 模擬飛機螺旋槳(自由發揮)，類似讀取過程的動畫百分比
 * 
 * 功能說明：
 *   使用跳脫字元和sleep去實現，飛機螺旋槳轉動的效果，最後印出百分比
 *
 * 日期:2025/09/26
 *
 * 姓名:張竣傑
 *	
 * 學號:41343224
 * 
 * 請給我100分!!
 */

public class CSIE_41343224_0926_2{

	public static void main(String[] args)throws Exception{
		System.out.println("起飛囉!!");
		for(int i = 0 ; i<=100 ; i++){
			System.out.print("\r-");
			System.out.print("<=O=>");
			System.out.print("-");
			Thread.sleep(50);
			System.out.print("\r\\");
			System.out.print("<=O=>");
			System.out.print("\\");
			Thread.sleep(50);
			System.out.print("\r|");
			System.out.print("<=O=>");
			System.out.print("|");
			Thread.sleep(50);
			System.out.print("\r/");
			System.out.print("<=O=>");
			System.out.print("/");
			Thread.sleep(50);
			System.out.print(i+"%");
		}	
	}

}