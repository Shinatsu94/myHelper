import java.util.Scanner;
public class CSIE_41343112_1031_3b{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int high=sc.nextInt();
		int target=sc.nextInt();
		int num=0;
		int oldnum=0;
		for(int i=1;i<=high;i++){
			num+=i;
			if(target<=num){
			System.out.printf("%d[%d, %d]",target,i,target-oldnum);
			break;
			}
			else if(i==high)System.out.printf("not find %d in array.",target);
			oldnum=num;
			
		}
	} 
}
//第四題
//將數字 1, 2, 3, .... 依照由上到下，由左到右的順序填入一個下三角形矩陣，找到此數字出現在此下三角形的位	置，印出此數字與此位置的列編號和行編號。
//41343112 李宗懌
//日期:10/31