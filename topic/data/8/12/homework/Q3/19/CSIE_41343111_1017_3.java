import java.util.Scanner;
public class CSIE_41343111_1017_3{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int in = s.nextInt();
        while(in>9&&in%10==0)
            in/=10;
        String D=""+in;
        for(int i=D.length()-1;i>=0;i--)
            System.out.print(D.charAt(i));
    }
}