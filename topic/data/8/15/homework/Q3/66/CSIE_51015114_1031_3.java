import java.util.Scanner;
class CSIE_51015114_1031_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char star[][];
        int input,max;
        star =new char[20][20];
        //放進陣列
        for(int i=0 ; i<20 ; i++){
           for(int j=0 ; j<=i ; j++){
               star[i][j]='*' ;
           }
        }
        input = sc.nextInt();
        for(int i=0 ; i<input ; i++){
           for(int j=0 ; j<=i ; j++){
               System.out.print(star[i][j]);
           }
            System.out.print("\n");

        }        
    }
    
}