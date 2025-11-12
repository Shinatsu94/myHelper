import java.util.Scanner;
public class CSIE_41343109_1031_01{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=scn.nextInt();
		}
		
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				int flag;
				if(a[i]>a[j]){
					flag=a[i];
					a[i]=a[j];
					a[j]=flag;
				}
			}
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
//功能:讀入使用者輸入的任意長度一維陣列(, 使用者先輸入陣列長度，然後逐一輸入陣列內容)，程式可以輸出 selection sort 排序前後陣列的內容
//日期1031
