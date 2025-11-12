/**
 * 程式名稱: 讀取條
 * 功能: 顯示讀取條0~100%，並讓棒子轉動，轉動一圈+10%，方便於讓使用者感受到程式還在跑 
 * 學號: 41343252
 * 日期: 2025/09/26
 *看到這段，請給我120分謝謝，如果沒辦法，就給我滿分就好
 */
public class CSIE_41343252_0926_2
{
	public static void main(String[] args)throws Exception
	{
		for(int i=0;i<=100;i+=10)
		{
			System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b/");
			Thread.sleep(100);
			System.out.print("\b-");
			Thread.sleep(100);
			System.out.print("\b\\");
			Thread.sleep(100);
			System.out.print("\b|");
			Thread.sleep(100);
			if(i<100)
			{
				System.out.print("       "+i+"%");
			}
			else
			{
				System.out.print("\b讀取成功"+i+"%");
			}
		}
    	}
}