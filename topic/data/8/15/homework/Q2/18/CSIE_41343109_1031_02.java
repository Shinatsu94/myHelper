import java.util.Scanner;
public class CSIE_41343109_1031_02{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=scn.nextInt();
		}
		for(int i=0;i<a.length;i++){
			int max=-1;
			for(int j=i+1;j<a.length;j++){
				if(a[j]>max&&i!=a.length-1)max=a[j];
				
			}
			
			a[i]=max;
		}
		for(int i=0;i<a.length;i++){
		if(i!=0)System.out.print(" "); 
		System.out.print(a[i]);
		if(i+1!=a.length)System.out.print(" "); 
		}

	}
}
//吳育丞
//41343109
//功能:讀入使用者輸入的任意長度一維陣列(, 使用者先輸入陣列長度，然後逐一輸入陣列內容)，程式將陣列每一元素置換為出現在它之後的最大值(, 陣列最後一個元素直接替換為-1), 並將此陣列印出
//日期1031
