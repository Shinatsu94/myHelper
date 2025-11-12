public class CSIE_41343107_0926_2
{

public static void main(String[] args)  throws Exception {

       char A = '\\';
       char B = '|';
       char C = '/';
       char D = '-';
       for(int i=0;i<=100;i++){
	System.out.print("\r "+A);
        Thread.sleep(100);
	System.out.print("\r "+B);
        Thread.sleep(100);
	System.out.print("\r "+C);
        Thread.sleep(100);
	System.out.print("\r "+D);
        Thread.sleep(100);
	if(i==10) System.out.print("  10%");
	if(i==30) System.out.print("  30%");
	if(i==50) System.out.print("  50%");
	if(i==70) System.out.print("  70%");
	if(i==100) System.out.print("  100%");
       }
	System.out.print("\r完成");
    }
}
/*
 姓名: 王世豪
 學號: 41343107
 功能: 旋轉的棒子+進度
 日期: 2025/09/26
*/