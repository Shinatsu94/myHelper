// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class CSIE_51015108_1017_3 {
    public static void main(String[] args) {
          Scanner s=new Scanner(System.in);
          int a = s.nextInt();
          int b;
        while(a>0)
        {
            b=a%10;
            a=a/10;
            if(b!=0)
            {
            System.out.printf("%d",b);
        }
        }}}
        