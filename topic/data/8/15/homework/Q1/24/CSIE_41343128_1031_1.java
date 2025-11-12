import java.util.Scanner;
public class CSIE_41343128_1031_1{	
	public static void main (String[] args){
		Scanner scn=new Scanner(System.in);	
		int n;
		int small;
		n=scn.nextInt();
		int list[];
		list=new int[n];
		for(int i=0;i<n;i++){
		   list[i]=scn.nextInt();
		}
		for(int a=0;a<list.length-1;a++){
		   small=a;
		   for(int b=a+1;b<list.length;b++ ){
			if(list[small]>list[b]){
			small=b;
			}
		   }
 		   int temp=list[a];
		   list[a]=list[small];
		   list[small]=temp;
		}
		
		for(int i=0;i<list.length-1;i++){
		System.out.print(list[i]+" ");
		}
	        System.out.print(list[list.length-1]);

	

	}
}
/*
2025/10/31
作者:陳廷鑫
最後編輯時間: 09:37
功能:選擇排序
*/