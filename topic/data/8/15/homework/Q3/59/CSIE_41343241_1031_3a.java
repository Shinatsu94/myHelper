import java.util.Scanner;
public class CSIE_41343241_1031_3a {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int lengthget = sc.nextInt();
        if(lengthget<1 || lengthget>20)return;
        char n[][] = new char[lengthget][lengthget];
        for(int i=0;i<lengthget;i++){//將陣列初始化
            for(int j=0;j<lengthget;j++){
                if(j<=i)n[i][j] = '*';
                else n[i][j] = ' ';
            }
        }
        for(int i=0;i<lengthget;i++){//print
            for(int j=0;j<=i;j++){
                System.out.print(n[i][j]);
                //if(j<i)System.out.print(' ');//*間空格
            }
            System.out.println();
        }
    }
}
