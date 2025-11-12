import java.util.Scanner;
public class CSIE_41343128_1031_3a{
	public static void main (String[] args){
		Scanner scn=new Scanner(System.in);	
		int n;
		n=scn.nextInt();
		char list[][];
		list=new char[n][];
		for(int i=0;i<n;i++){
		   list[i] =new char[i+1];
		   for(int a=0;a<i+1;a++){
		   list[i][a]='*';
			}
		}		
		for (int i = 0; i < n; i++) {
            	for (int a = 0; a < list[i].length; a++) {
                System.out.print(list[i][a]);
           	 }
           	 System.out.println();
        }

	

	}

}