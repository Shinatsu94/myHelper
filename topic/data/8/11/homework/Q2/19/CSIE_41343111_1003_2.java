import java.util.Scanner;
public class CSIE_41343111_1003_2{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a,b,c;
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        int max,mid,min;
        max = a>b&&a>c ? a : b>c ? b : c;
        min = a<b&&a<c ? a : b<c ? b : c;
        mid = a+b+c-max-min;
        System.out.println(min);
        System.out.println(mid);
        System.out.println(max);
    }
}