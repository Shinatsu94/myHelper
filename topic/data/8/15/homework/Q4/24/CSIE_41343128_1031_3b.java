import java.util.Scanner;
public class CSIE_41343128_1031_3b{
	public static void main (String[] args){
		Scanner scn=new Scanner(System.in);	
		int n,findn;
		n=scn.nextInt();
		findn=scn.nextInt();
		int list[][];
		list=new int[n][];
		for(int i=0;i<n;i++){
		   list[i] =new int[i+1];
		  }
		int num=1;
		for(int a=0;a<n;a++){
		for (int b = 0; b <= a; b++) {
      	        list[a][b] = num++;
    				}			

		}		
		boolean find=false;     
		for(int a=0;a<n;a++){
		for (int b = 0; b <= a; b++) {
			if(list[a][b]==findn){
			find=true;
			System.out.print(list[a][b]+"["+(a+1)+", "+(b+1)+"]");
			}
      	            }			

		}
		if(!find){
		System.out.print("not find 99 in array.");
		}
	

	}

}