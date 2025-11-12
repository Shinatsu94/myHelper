import java.util.Scanner;

public class  CSIE_41343219_1031_3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); sc.close();
        char[][] matx = new char[n][];
        
        for(int i=0;i<n;i++)
        {
            matx[i] = new char[i+1];
            for(int j=0;j<=i;j++) matx[i][j] = '*';
        }
        
        for(char i[]:matx)
        {
            for(char j:i) System.out.print(j);
            System.out.println();
        }
    }
}