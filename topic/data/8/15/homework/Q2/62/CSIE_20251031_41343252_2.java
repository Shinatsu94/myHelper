import java.util.Scanner;
public class CSIE_20251031_41343252_1{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int l;
		l=in.nextInt();
		int a[]=new int [l];
		for(int i=0;i<l;i++)	a[i]=in.nextInt();
		int max;
		for(int i=0;i<a.length;i++){
			if(i+1<a.length)
				max=a[i+1];
			else
				max=-1;
			for(int j=i+1;j<a.length;j++){
				if(a[j]>max) max=a[j];
			}
			if(i<a.length-1)
				System.out.print(max+" ");
			if(i==a.length-1)
				System.out.print(max);
		}	
	}	
}