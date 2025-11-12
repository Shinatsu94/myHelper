import java.util.Scanner;
public class csie_1003_41343214__3{
 public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int count = 0;

        for (int i = 1; i <= 100000; i++) {
            int sum = 0;
            int num = i;

                        while (num > 0) {
                sum =sum + num % 10; 
                num =num / 10;                 
         }

           
            if (sum == A) {
                count++;
            }
        }

        System.out.println( count);

        scanner.close();
    }
}