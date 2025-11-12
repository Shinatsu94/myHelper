import java.util.Scanner;
public class CSIE_41343226_1031_2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int c=scanner.nextInt();
		int[] num=new int[c];
		for(int i=0;i<c;i++){
			num[i]=scanner.nextInt();
		}
		for(int i=0;i<c-1;i++){
			num[i]=num[i+1];
			for(int j=i+1;j<c;j++){
				if (num[i]<num[j]){
					num[i]=num[j];
				}
			}
		}
		num[c-1]=-1;
		for(int i=0;i<c;i++){
			System.out.print(num[i]);
			if (i<c-1)System.out.print(" ");
		}
	}
}