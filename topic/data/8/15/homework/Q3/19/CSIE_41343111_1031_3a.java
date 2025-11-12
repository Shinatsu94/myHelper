import java.util.Scanner;
public class CSIE_41343111_1031_3a{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int in = s.nextInt();
        for(int i=1;i<in+1;i++){
            for(int j=0;j<i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}