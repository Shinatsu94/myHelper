import java.util.Scanner;

public class CSIE_41343210_0926_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number >= 60){
            System.out.println("及格");
        
        }else if (number < 60 && number >= 50){
            System.out.println("補考");
        
        }else if (number < 50){
            System.out.println("不及格");
        
        }
    }


}