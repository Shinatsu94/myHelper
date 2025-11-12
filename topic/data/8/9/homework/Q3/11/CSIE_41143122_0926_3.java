//package h4w;
import java.util.Scanner;

public class CSIE_41143122_0926_3 {
    public static void main(String[] args){ 
        while(true){
            Scanner scanner = new Scanner(System.in);
            int score = scanner.nextInt();
            if(score>=60){
                System.out.printf("及格\n");
            }
            else if(score<50){
                System.out.printf("不及格\n");
            }
            else{
                System.out.printf("補考\n");
            }
        }
    }
}
