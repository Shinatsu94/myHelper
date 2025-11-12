import java.util.Scanner;
public class CSIE_41343222_1031_1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		//System.out.print("你要的陣列長度");
		int a=scanner.nextInt();
		int ary[]= new int[a];
		for(int y=0;y<a;y++){
			ary[y]=scanner.nextInt();
		}
		//System.out.print("\n排列前的陣列：");
		/*for(int y=0;y<a;y++){
			System.out.print(""+ary[y]+" ");
		}*/
		for(int m=0;m<a;m++){
			for(int w=m+1;w<a;w++){
				if(ary[m]>ary[w]){
					int cha=ary[m];
					ary[m]=ary[w];
					ary[w]=cha;
				}
			}
		}
		//System.out.print("\n排列後的陣列：");
		for(int y=0;y<a;y++){
			System.out.print(""+ary[y]+" ");
		}
	}
}	