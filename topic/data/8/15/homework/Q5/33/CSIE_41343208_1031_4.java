import java.util.Scanner;

public class CSIE_41343208_1031_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] a = new double[3][3];
        double det;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextDouble();
            }
        }

        // 計算行列式
        det = a[0][0]*(a[1][1]*a[2][2]-a[2][1]*a[1][2])
            - a[0][1]*(a[1][0]*a[2][2]-a[2][0]*a[1][2])
            + a[0][2]*(a[1][0]*a[2][1]-a[2][0]*a[1][1]);

        /*if (det == 0) {
            System.out.println("此矩陣沒有反矩陣（行列式為0）");
            return;
        }*/

        // 計算反矩陣
        double[][] inv = new double[3][3];
        inv[0][0] = (a[1][1]*a[2][2]-a[2][1]*a[1][2]) / det;
        inv[0][1] = -(a[0][1]*a[2][2]-a[2][1]*a[0][2]) / det;
        inv[0][2] = (a[0][1]*a[1][2]-a[1][1]*a[0][2]) / det;
        inv[1][0] = -(a[1][0]*a[2][2]-a[2][0]*a[1][2]) / det;
        inv[1][1] = (a[0][0]*a[2][2]-a[2][0]*a[0][2]) / det;
        inv[1][2] = -(a[0][0]*a[1][2]-a[1][0]*a[0][2]) / det;
        inv[2][0] = (a[1][0]*a[2][1]-a[2][0]*a[1][1]) / det;
        inv[2][1] = -(a[0][0]*a[2][1]-a[2][0]*a[0][1]) / det;
        inv[2][2] = (a[0][0]*a[1][1]-a[1][0]*a[0][1]) / det;

        // 輸出反矩陣
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
		if(inv[i][j]==0){
		System.out.printf("0");
                
                }
		else{
		    System.out.printf("%2.4f ", inv[i][j]);
		}
            	
        }
		System.out.printf("\n");
    }
}
}
