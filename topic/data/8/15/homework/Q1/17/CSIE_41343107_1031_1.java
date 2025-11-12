import java.util.Scanner;
public class CSIE_41343107_1031_1
{
	public static void main(String args[])
	{
	Scanner same=new Scanner(System.in);
	int n=same.nextInt();
	int a[];
	a=new int[n];
	for(int i=0;i<a.length;i++){
	a[i]=same.nextInt();
	}	
	for(int i = 0; i < n - 1; i++){
	int b = i;
	for(int j = i + 1; j < n; j++){
	if(a[j] < a[b]){
	b = j;
	}
	}
	int c = a[i];
	a[i] = a[b];
	a[b] = c;
	}
	for(int i=0;i<a.length-1;i++){
	System.out.print(a[i]+" ");
	}
	System.out.print(a[n-1]);
	}
} 
/*
 姓名: 王世豪
 學號: 41343107
 功能: 可以輸出 selection sort 排序前後陣列的內容
 日期: 2025/10/31
*/