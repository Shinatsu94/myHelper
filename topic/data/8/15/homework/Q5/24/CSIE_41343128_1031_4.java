import java.util.Scanner;
public class CSIE_41343128_1031_4{
	public static void main (String[] args){
		Scanner scn=new Scanner(System.in);	
		int list[][];
		list=new int[3][3];
		for(int a=0;a<3;a++){
		   for (int b = 0; b <3; b++) {
      	              list[a][b] = scn.nextInt();
    		   }			
		}
		int total = 
   		 list[0][0] * list[1][1] * list[2][2] +
    		 list[0][1] * list[1][2] * list[2][0] +
   		 list[0][2] * list[1][0] * list[2][1] -
   		 list[0][2] * list[1][1] * list[2][0] -
   		 list[0][1] * list[1][0] * list[2][2] -
   		 list[0][0] * list[1][2] * list[2][1];

	 if (total == 0) {
            System.out.println("此矩陣無反矩陣（行列式為 0）");
            return;
        }

        double[][] adj = new double[3][3];

        adj[0][0] =  list[1][1] * list[2][2] - list[1][2] * list[2][1];
        adj[0][1] = -(list[1][0] * list[2][2] - list[1][2] * list[2][0]);
        adj[0][2] =  list[1][0] * list[2][1] - list[1][1] * list[2][0];

        adj[1][0] = -(list[0][1] * list[2][2] - list[0][2] * list[2][1]);
        adj[1][1] =  list[0][0] * list[2][2] - list[0][2] * list[2][0];
        adj[1][2] = -(list[0][0] * list[2][1] - list[0][1] * list[2][0]);

        adj[2][0] =  list[0][1] * list[1][2] - list[0][2] * list[1][1];
        adj[2][1] = -(list[0][0] * list[1][2] - list[0][2] * list[1][0]);
        adj[2][2] =  list[0][0] * list[1][1] - list[0][1] * list[1][0];

        double[][] inverse = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverse[i][j] = adj[j][i] / total;
            }
        }

       for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        System.out.printf("%.4f", inverse[i][j]);
        if (j < 2) System.out.print(" ");
    }
    if (i < 2) {
        System.out.println();
    }
}





	}

}