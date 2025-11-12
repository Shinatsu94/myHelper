import java.util.Scanner;
public class CSIE_20251031_41343252_3{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n;
		n=in.nextInt();
		String a[][]=new String[n][];
		for(int i=0;i<n;i++){
			a[i]=new String[i+1];
			for(int j=0;j<i+1;j++){
				a[i][j]="*";
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<a[i].length;j++)
				System.out.print(a[i][j]);
			System.out.println();
		}
	}	
}