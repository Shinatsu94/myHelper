// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class CSIE_51015108_1031_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int c=0;
        int a=1;
        int [][] array= new int [n+1][n+1];
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {c++;
            array[i][j]=c;
            }
        }
        int q = s.nextInt();
       
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(array[i][j]==q)
                {
                    
            System.out.printf("%d[%d, %d]", q, i, j);
            a=0;
                }else if(i==n&&j==n)
                {if(a==0)
                {
                    break;
                }
                    System.out.printf("not find %d in array.",q);
                    break;
                }
            }
        }
        
       
    }
}