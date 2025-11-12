import java.util.Scanner;
public class s1{
	public static void main(String[] args)throws Exception {
		int a[],z=0,x=0;
		//System.out.println("請輸入大小");
		Scanner s = new Scanner(System.in); 
		x = s.nextInt();
		a=new int[x];
		for(int i=0;i<x;i++){ 
			a[i] = s.nextInt();
		}
		for(int i=0;i<a.length;i++){
			if(i==a.length-1){
			z=a[i];
			}else{
				z=a[i+1];
			}
			for(int j=i;j<a.length-1;j++){
				if(z<=a[j+1])z=a[j+1];
			}
			a[i]=z;
		}
		a[a.length-1]=-1;
		for(int i=0;i<a.length-1;i++){
			System.out.printf("%d ",a[i]);
		}System.out.printf("%d",a[a.length-1]);

       }

    }