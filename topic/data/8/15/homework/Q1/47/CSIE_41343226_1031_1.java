import java.util.Scanner;
public class CSIE_41343226_1031_1 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int c=scanner.nextInt();
		int[] x=new int[c];
		for(int i=0;i<c;i++){
			x[i]=scanner.nextInt();
		}
		for(int i=0;i<c-1;i++){
			for(int j=i+1;j<c;j++){
				if(x[i]>x[j]){
					int tmp=x[i];
					x[i]=x[j];
					x[j]=tmp;				
				}
			}
		}
		for(int i=0;i<c;i++){
			System.out.print(x[i]);
			if (i<c-1)System.out.print(" ");
		}
	}
}