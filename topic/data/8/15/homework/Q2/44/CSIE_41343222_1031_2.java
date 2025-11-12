import java.util.Scanner;
public class CSIE_41343222_1031_2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int goal=scanner.nextInt();
		int ary[]=new int[goal];
		for(int u=0;u<goal;u++){
			ary[u]=scanner.nextInt();
		}
		//System.out.print("\n原始的陣列:");
		/*for(int u=0;u<goal;u++){
			System.out.print(""+ary[u]+" "); 
		}*/
		int cha[]=new int[goal];
		for(int q=1;q<goal;q++){
			int max=ary[q];
			for(int r=q+1;r<goal;r++){
				if(max<ary[r])max=ary[r];
			}
			cha[q-1]=max;	
		}
		cha[goal-1]=-1;
		//System.out.print("\n改變後的陣列:");
		for(int u=0;u<goal;u++){
			System.out.print(""+cha[u]+" "); 
		}
	}
}