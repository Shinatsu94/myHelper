import java.util.Scanner;

public class CSIE_41343205_1031_2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int max=-1;
		for(int i=n-1;i>=0;i--){
			int temp=arr[i];
			arr[i]=max;
			if(temp>max) max=temp;
		}
		for(int num:arr){
			System.out.print(num+" ");
		}
		sc.close();
	}
}
