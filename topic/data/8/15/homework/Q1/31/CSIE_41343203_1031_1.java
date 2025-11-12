import java.util.Scanner;
public class CSIE_41343203_1031_1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
	
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}

		ss(arr);
		for(int num : arr){
			System.out.print(num+" ");
		}
	
	}
	public static void ss(int[] arr){
		int n=arr.length;
		for(int i=0;i<n-1;i++){
			int min=i;
			for(int j=i+1;j<n;j++){
				if(arr[j]<arr[min]){
					min=j;
				}
			}
			if(min!=i){
				int temp=arr[min];
				arr[min]=arr[i];
				arr[i]=temp;
			}
		}
	
	}

}