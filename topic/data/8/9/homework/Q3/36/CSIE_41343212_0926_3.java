/* file name: CSIE_41343212_0926_3.java
   student: 李品劭
   ID: 41343212
   function: to determine if the score is passed
*/
import java.util.*;

public class CSIE_41343212_0926_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a score: ");
        int score  =  input.nextInt();
        if (score >= 60) System.out.println("pass");
        else if (score >= 50 && score < 60) System.out.println("make-up exam");
        else if (score >= 0 && score < 50) System.out.println("not pass");
    }
}
