import java.util.Scanner;
public class CSIE_41343112_1031_2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int arrSize=sc.nextInt();//設定陣列大小
		int arr[];
		arr=new int[arrSize];
		for(int i=0;i<arrSize;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arrSize-1;i++){
			int max=arr[i+1];//從數值後面開始
			for(int j=i+2;j<arrSize;j++){
				
				
				if(arr[j]>max)max=arr[j];
			}
			arr[i]=max;
			
		}
		arr[arrSize-1]=-1;
		for(int i=0;i<arrSize;i++){
			System.out.print(((i!=0)?" ":"")+arr[i]);//三元運算判斷，第一個數值前不加空格
		}
	}
}
//第二題
//程式將陣列每一元素置換為出現在它之後的最大值
//41343112 李宗懌
//日期:10/31