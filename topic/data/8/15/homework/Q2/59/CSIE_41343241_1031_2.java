
import java.util.Scanner;

public class CSIE_41343241_1031_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int lengthget = sc.nextInt();
        int score[] = new int[lengthget];
        for(int i=0;i<lengthget;i++){
            score[i] = sc.nextInt();
        }
        for(int i=0;i<lengthget;i++){
            System.out.print(score[i]+" ");
        }
        System.out.println();
        for(int i=0;i<lengthget;i++){
            int temp=0;
            for(int j=i+1;j<lengthget;j++){
                if(temp<score[j])temp = score[j];
            }
            score[i] = temp;
        }
        score[lengthget-1] = -1;
        for(int i=0;i<lengthget;i++){
            System.out.print(score[i]+" ");
        }
        System.out.println();
    }
}
