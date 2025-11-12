import java.util.Scanner;

public class CSIE_51015120_0926_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (input.hasNextInt()) {  // 輸入分數
            
            int grade = input.nextInt();
            if (grade >= 60) {
                System.out.println("及格");
            } else if (grade >= 50) {
                System.out.println("補考");
            } else {
                System.out.println("不及格");
            }
        }

        input.close();
    }
}