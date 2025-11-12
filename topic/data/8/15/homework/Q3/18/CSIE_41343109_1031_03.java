import java.util.Scanner;
public class CSIE_41343109_1031_03{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		char[][] a=new char[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
			a[i][j]='*';
					}	
			
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				System.out.print(a[i][j]);
			}
			System.out.println();
		}

	}
}
//吳育丞
//41343109
//功能:讀入使用者輸入的任意長度一維陣列(, 使用者先輸入陣列長度，然後逐一輸入陣列內容)，程式將陣列每一元素置換為出現在它之後的最大值(, 陣列最後一個元素直接替換為-1), 並將此陣列印出
//日期1031
