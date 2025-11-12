
import java.util.Scanner;

public class CSIE_41343241_1031_1{
    public static void main(String[] args){
        int sum=0,max,min,lengthget;
        Scanner sc = new Scanner(System.in);
        lengthget = sc.nextInt();
        int score[] = new int[lengthget];
        for(int i=0;i<lengthget;i++){
            score[i] = sc.nextInt();
        }
        /*for(int i=0;i<lengthget;i++){
            System.out.print(score[i]+" ");
        }*/
        //System.out.println();
        max = score[0];
        min = score[0];
        for(int i=0;i<score.length;i++){//排序
            for(int j=i+1;j<score.length;j++){
                if(score[i]>score[j]){
                    int temp = score[i];
                    score[i] = score[j];
                    score[j] = temp;
                }
            }
            if(score[i]>max)max = score[i];
            if(score[i]<min)min = score[i];
        }
        for(int i=0;i<lengthget;i++){
            System.out.print(score[i]+" ");
        }
        //System.out.println();
        //System.out.println("max = " + max);
        //System.out.println("min = "+ min);
        //System.out.println("score[].lemgth = " + score.length);//陣列長度
        //System.out.println("score[].average = " + (float)sum/score.length);//平均s
    }
}
