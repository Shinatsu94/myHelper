import java.util.*;
public class CSIE_41343111_1031_4{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[][] D = new int[3][3];
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                D[i][j]=s.nextInt();
        int X = D[0][0]*D[1][1]*D[2][2]
               +D[0][1]*D[1][2]*D[2][0]
               +D[0][2]*D[1][0]*D[2][1]
               -D[0][2]*D[1][1]*D[2][0]
               -D[0][0]*D[1][2]*D[2][1]
               -D[0][1]*D[1][0]*D[2][2];
        int D2[][] = {
                        {D[1][1]*D[2][2]-D[1][2]*D[2][1] , (D[1][0]*D[2][2]-D[1][2]*D[2][0])*-1 , D[1][0]*D[2][1]-D[1][1]*D[2][0]},
                        {(D[0][1]*D[2][2]-D[0][2]*D[2][1])*-1 , D[0][0]*D[2][2]-D[0][2]*D[2][0] , (D[0][0]*D[2][1]-D[0][1]*D[2][0])*-1},
                        {D[0][1]*D[1][2]-D[0][2]*D[1][1] , (D[0][0]*D[1][2]-D[0][2]*D[1][0])*-1 , D[0][0]*D[1][1]-D[0][1]*D[1][0]}
                     };
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(j!=0)
                    System.out.print(" ");
                if((double)D2[j][i]/X==0)
                    System.out.print("0");
                else
                    System.out.printf("%.4f",(double)D2[j][i]/X);
            }
            System.out.println();
        }

    }
}