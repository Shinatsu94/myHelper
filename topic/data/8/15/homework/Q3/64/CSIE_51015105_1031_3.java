import java.util.Scanner;

public class CSIE_51015105_1031_3
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int n = scanner.nextInt();
	    char[][] lowertri= new char[n+1][n+1] ;
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=i;j++){
	            lowertri[i][j]='*';
	        }
	    }
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=i;j++){
	            System.out.print(lowertri[i][j]);
	        }
	        System.out.print("\n");
	    }
	}
}
