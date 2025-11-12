
import java.util.Scanner;
public class CSIE_41343241_0926_3
{
    public static void main(String[] args)
    {
        Scanner fscn = new Scanner(System.in);
        System.out.print("Enter a number :");
        float score = fscn.nextFloat();// to avoid calling nextFloat() multiple times
        if(score>=60)
            System.out.println("及格");
        else if(score<60 && score>=50)
            System.out.println("補考");
        else
            System.out.println("不及格");
        fscn.close();
    }
}