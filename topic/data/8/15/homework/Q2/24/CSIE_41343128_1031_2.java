import java.util.Scanner;
public class CSIE_41343128_1031_2{
	public static void main (String[] args){
		Scanner scn=new Scanner(System.in);	
		int n;
		int large;
		n=scn.nextInt();
		int list[];
		list=new int[n];
		for(int i=0;i<n;i++){
		   list[i]=scn.nextInt();
		}
                for(int a=0;a<list.length-1;a++){
		   large=a+1;
		   for(int b=a+1;b<list.length;b++ ){
			if(list[large]<list[b]){
			large=b;
			}
		   }
		   list[a]=list[large];
		}
		list[n-1]=-1;
		for(int i=0;i<list.length-1;i++){
		System.out.print(list[i]+" ");
		}
		 System.out.print(list[list.length-1]);

	

	}





}
/*
2025/10/31
作者:陳廷鑫
最後編輯時間: 10:20
功能:將陣列每一元素置換為出現在它之後的最大值
*/