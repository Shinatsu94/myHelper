import java.util.Scanner;
public class s{
	public static void main(String[] args)throws Exception {
		int a[],z=0,x=0;
		Scanner s0 = new Scanner(System.in); 
		x = s0.nextInt();
		a=new int[x];
		for(int i=0;i<x;i++){ 
			a[i] = s0.nextInt();
			//System.out.printf("%d ",a[i]);
		}
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length-1;j++){
				if(a[j]>=a[j+1]){
					int p=a[j];
					a[j]=a[j+1];
					a[j+1]=p;

				}
			}
		}
		for(int i=0;i<a.length-1;i++){
			System.out.printf("%d ",a[i]);
		}
System.out.printf("%d",a[a.length-1]);

       }

    }