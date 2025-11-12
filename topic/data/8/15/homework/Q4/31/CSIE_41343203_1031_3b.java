import java.util.Scanner;
public class CSIE_41343203_1031_3b{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
		
		
		int n=sc.nextInt();
		if(n<=0||n>20){
			return;
		}

		int[][] tran=new int[n][];
		int num=1;
		boolean stop=false;
		for(int i=0;i<n;i++){
			tran[i]=new int[i+1];
			for(int j=0;j<=i;j++){
				tran[i][j]=num++;
				if(num>100000){
					stop=true;
					break;
				}
			}
			if(stop)break;
		}
	int target=sc.nextInt();
	boolean found=false;
	for(int i=0;i<n &&!found;i++){
		for(int j=0;j<tran[i].length;j++){
			if(tran[i][j]==target){
				System.out.println(target+"["+(i+1)+", "+(j+1)+"]");
				found=true;
				break;
			}
		}
	}
	if(!found){
		System.out.println("not find "+target+" in array.");
		return;
	}
	}
	sc.close();
	}
}