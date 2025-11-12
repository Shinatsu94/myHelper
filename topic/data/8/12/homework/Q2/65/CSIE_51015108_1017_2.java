// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class CSIE_51015108_1017_2 {
    public static void main(String[] args) {
          Scanner s=new Scanner(System.in);
          int a = s.nextInt();
          int b=a%10,c,n=a;
          a=a/10;
         int d=1;
        while(a>0)
        {c=a%10;
    
            if(c<b)
            {
                b=c;
            a=a/10;
            }else
            {System.out.printf("%d is not well-ordered number.",n);
            d=0;
                break;
            }
            
        }
        if(d==1)
        {
        System.out.printf("%d is well-ordered number.",n);
        }
        }
        }
        