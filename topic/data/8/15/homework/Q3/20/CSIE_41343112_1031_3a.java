import java.util.Scanner;
public class CSIE_41343112_1031_3a{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//輸入星星的高度
		for(int i=n; i>0;i--){
			for(int j=0;j<=n-i;j++){
				System.out.printf("*");
			}
			System.out.printf("\n");

		}
	}
}
//第三題
//三角形以'*'符號顯示在銀幕
//41343112 李宗懌
//日期:10/31