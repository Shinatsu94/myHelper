import java.util.Scanner;
public class CSIE_41343124_1003_1{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a,b;
        a=s.nextInt();
        b=s.nextInt();
        a+=b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);

    }
}