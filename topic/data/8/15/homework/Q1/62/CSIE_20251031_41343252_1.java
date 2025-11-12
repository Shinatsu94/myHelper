import java.util.Scanner;
public class CSIE_20251031_41343252_2{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int l;
		int temp;
		l=in.nextInt();
		int a[]=new int [l];
		for(int i=0;i<l;i++)	a[i]=in.nextInt();
		for(int i=0;i<a.length;i++){
			for(int j=i;j<a.length;j++){
				if(a[j]<a[i]){
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;	
				}
					
			}
		}
		for(int i=0;i<a.length;i++){
			if(i<a.length)
				System.out.print(a[i]+" ");
			else
				System.out.print(a[i]);
		}
	}	
}