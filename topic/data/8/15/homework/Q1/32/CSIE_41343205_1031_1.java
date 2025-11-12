import java.util.Scanner;

public class CSIE_41343205_1031_1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();

		int arr[]=new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		//printArray(arr);
		
		for(int i=0;i<n-1;i++){
			int min=i;
			for(int j=i+1;j<n;j++){
				if(arr[j]<arr[min])min=j;
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		printArray(arr);
		sc.close();
	}
	public static void printArray(int arr[]){
		for(int num:arr){
			System.out.print(num+" ");
		}
		System.out.println();
	}
}