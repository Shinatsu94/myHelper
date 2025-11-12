import java.util.Scanner;

public class CSIE_51015105_1031_1
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int n = scanner.nextInt();
	    int[] sort_array= new int[n] ;
	    for(int i=0;i<sort_array.length;i++){
	        sort_array[i]=scanner.nextInt();
	    }
	    for(int i=0;i<sort_array.length;i++){
	        int minimumindex=i;
	        for(int j=i+1;j<sort_array.length;j++){
	            if(sort_array[j]<sort_array[minimumindex]){
	                minimumindex=j;
	            }
	        }
	        int temp=sort_array[i];
	        sort_array[i]=sort_array[minimumindex];
	        sort_array[minimumindex]=temp;
	    }
	    for(int i=0;i<sort_array.length;i++){
	        System.out.printf("%d",sort_array[i]);
		if((sort_array.length-i)>1){
	            System.out.printf(" ");
	        }
	    }
	}
}
