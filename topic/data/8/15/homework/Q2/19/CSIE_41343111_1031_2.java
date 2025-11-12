import java.util.Scanner;
public class CSIE_41343111_1031_2{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int in = s.nextInt() , max;
        int[] D1 = new int[in] , D2 = new int[in];
        for(int i=0;i<in;i++)
            D1[i] = s.nextInt();
        for(int i=0;i<in-1;i++){
            max = D1[i+1];
            for(int j=in-1;j>i;j--)
                if(D1[j]>max)
                    max = D1[j];
            D2[i] = max;
        }
        for(int i=0;i<in-1;i++)
            System.out.print(D2[i]+" ");
        System.out.print("-1");
    }
}