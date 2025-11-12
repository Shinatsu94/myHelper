import java.util.Scanner;
public class CSIE_20251031_41343252_3{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n,x,count=0,logi=-1,logj=-1;
		n=in.nextInt();
		x=in.nextInt();
		int a[][]=new int[n][];
		for(int i=0;i<n;i++){
			a[i]=new int[i+1];
			for(int j=0;j<i+1;j++){
				count=count+1;
				a[i][j]=count;
				if(a[i][j]==x){
					logi=i;logj=j;
					break;
				}
			}
		}
		if(logi==-1&&logj==-1)
			System.out.print("not find "+x+" in array.");
		else
			System.out.print(x+"["+(logi+1)+", "+(logj+1)+"]");
	}	
}