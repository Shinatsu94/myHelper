import java.util.Scanner;

public class CSIE_51015105_1031_2
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int n = scanner.nextInt();
	    int[] sort_array= new int[n] ;
	    for(int i=0;i<sort_array.length;i++){
	        sort_array[i]=scanner.nextInt();
	    }
	    
	    for(int i=0;i<sort_array.length-1;i++){
	        int maximumindex=i+1;
	        for(int j=i+1;j<sort_array.length;j++){
	            if(sort_array[j]>sort_array[maximumindex]){
	                maximumindex=j;
	            }
	        }
	        sort_array[i]=sort_array[maximumindex];
	    }
	    sort_array[sort_array.length-1]=-1;
	    for(int i=0;i<sort_array.length;i++){
	        System.out.printf("%d",sort_array[i]);
		if((sort_array.length-i)>1){
	            System.out.printf(" ");
	        }
	    }
	}
}
