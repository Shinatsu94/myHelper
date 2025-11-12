import java.util.Scanner;
public class CSIE_41343112_1031_1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int arrSize=sc.nextInt();//輸入陣列大小
		int arr[];
		arr=new int[arrSize];
		for(int i=0;i<arrSize;i++){
			arr[i]=sc.nextInt();//輸入數值
		}
		for(int i=0;i<arrSize;i++){//氣泡排序法
			for(int j=i;j<arrSize;j++){
				if(arr[i]>arr[j]){//交換
					int t;
					t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;	
				}
			}
		}
		for(int i=0;i<arrSize;i++){
			System.out.printf(((i!=0)?" ":"")+arr[i]);//三元運算判斷，第一個數值前不加空格
		}
	}

}
//第一題
//輸入數字進行排序
//41343112 李宗懌
//日期:10/31