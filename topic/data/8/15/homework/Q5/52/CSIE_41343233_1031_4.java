import java.util.Scanner;

public class CSIE_41343233_1031_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[][] arr = new double[3][3];

        // 讀入矩陣
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = in.nextDouble();
            }
        }

        // 計算行列式
        double det = arr[0][0]*(arr[1][1]*arr[2][2]-arr[1][2]*arr[2][1])
                   - arr[0][1]*(arr[1][0]*arr[2][2]-arr[1][2]*arr[2][0])
                   + arr[0][2]*(arr[1][0]*arr[2][1]-arr[1][1]*arr[2][0]);

        if(det == 0){
            System.out.println("The matrix is not invertible.");
            return;
        }

        // 計算伴隨矩陣（cofactor matrix 的轉置）
        double[][] cofactor = new double[3][3];

        cofactor[0][0] =  arr[1][1]*arr[2][2] - arr[1][2]*arr[2][1];
        cofactor[0][1] = -(arr[1][0]*arr[2][2] - arr[1][2]*arr[2][0]);
        cofactor[0][2] =  arr[1][0]*arr[2][1] - arr[1][1]*arr[2][0];

        cofactor[1][0] = -(arr[0][1]*arr[2][2] - arr[0][2]*arr[2][1]);
        cofactor[1][1] =  arr[0][0]*arr[2][2] - arr[0][2]*arr[2][0];
        cofactor[1][2] = -(arr[0][0]*arr[2][1] - arr[0][1]*arr[2][0]);

        cofactor[2][0] =  arr[0][1]*arr[1][2] - arr[0][2]*arr[1][1];
        cofactor[2][1] = -(arr[0][0]*arr[1][2] - arr[0][2]*arr[1][0]);
        cofactor[2][2] =  arr[0][0]*arr[1][1] - arr[0][1]*arr[1][0];

        // 轉置並除以行列式得到反矩陣
        double[][] inverse = new double[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                inverse[i][j] = cofactor[j][i] / det;
            }
        }

        // 輸出結果
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(inverse[i][j] == 0){ // 如果元素為零，直接輸出 0
                    System.out.print("0");
                } else {
                    System.out.printf("%.4f", inverse[i][j]);
                }
                if(j != 2) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
