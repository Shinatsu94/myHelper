// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        char [][] array= new char [n+1][n+1];
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
            array[i][j]='*';
            }
        }
        
       
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
            System.out.print(array[i][j]);
            }System.out.printf("\n");
        }
        
       
    }
}