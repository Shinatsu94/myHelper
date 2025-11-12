import java.util.Scanner;

public class CSIE_51015105_1031_4
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int n = scanner.nextInt();
	    int find = scanner.nextInt();
	    int[][] lowertri= new int[n][n] ;
	    int count=1;
	    for(int i=0;i<n;i++){
	        for(int j=0;j<=i;j++){
	            lowertri[i][j]=count;
	            count++;
	        }
	    }
	    if(find>count){
	        System.out.printf("not find %d in array.",find);
	    }
	    else{
    	    for(int i=0;i<n;i++){
    	        for(int j=0;j<=i;j++){
    	            if(lowertri[i][j]==find){
    	                System.out.printf("%d[%d, %d]",find,i+1,j+1);
    	            }
    	        }
    	    }
	    }    
	}
}
