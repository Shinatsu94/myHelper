import java.util.Scanner;

public class CSIE_41343221_0926_3 {

    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("請輸入考試分數 (整數): ");
        
        int c = s.nextInt();
        
        s.close();
        
        if (c >= 60) {
            System.out.println("結果: 及格");
        } else if (c >= 40) {
            System.out.println("結果: 補考");
        } else {
            System.out.println("結果: 不及格");
        }
    }
}