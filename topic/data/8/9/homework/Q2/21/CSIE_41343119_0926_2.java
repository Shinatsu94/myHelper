public class CSIE_41343119_0926_2{
  public static void main(String args[])throws Exception
    {
	char ch1='-';
	char ch2='/';
	char ch3='|';
	char ch4='\\';
	for(int i=0;i<=100;i++){
	  Thread.sleep(50);
	  if(i%4==0){System.out.print("\r"+ch1+"\t"+i+"%");}
	  Thread.sleep(50);
	  if(i%4==1){System.out.print("\r"+ch2+"\t"+i+"%");}
	  Thread.sleep(50);
	  if(i%4==2){System.out.print("\r"+ch3+"\t"+i+"%");}
	  Thread.sleep(50);
	  if(i%4==3){System.out.print("\r"+ch4+"\t"+i+"%");}
	  Thread.sleep(50);
		
	}
	System.out.println("\n"+"加載完成!");
    }


}
/*姓名 金宗翰
  學號 41343119
  功能 旋轉棒子和進度
  日期 2025/9/26
*/