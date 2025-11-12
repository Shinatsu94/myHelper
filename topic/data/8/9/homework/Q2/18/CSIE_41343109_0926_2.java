public class CSIE_41343109_0926_2{//學號41343109 姓名:吳育丞 功能選轉棒子加進度 日期:2025/0926
public static void main(String[] args)  throws Exception {
	
       while(true) {
	for(int i=0;i<=100;i++){
	     System.out.print("\r"+"|");
             Thread.sleep(100);
	     System.out.print("\r"+"/");
             Thread.sleep(100);
		System.out.print("\r"+"-");
             Thread.sleep(100);
		System.out.print("\r"+"\\");
             Thread.sleep(100);System.out.print(" "+i+"%");
	}break;
       }
    }
}