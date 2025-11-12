import java.util.Scanner;
import java.util.Arrays;
public class CSIE_41343111_1031_1{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int in = s.nextInt();
        int[] D = new int[in];
        for(int i=0;i<D.length;i++)
            D[i] = s.nextInt();
        Arrays.sort(D);
        for(int i=0;i<D.length;i++){
            if(i!=0)
                System.out.print(" ");
            System.out.print(D[i]);
        }
    }
}