// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class CSIE_51015108_1031_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] array= new int [n];
        for (int i=0;i<n;i++) 
        {
            array[i]=s.nextInt();
        }
       for(int i=0;i<n;i++)
       {if(i!=n-1)
               {
                  array[i]=array[i+1];
               }
           for(int j=i+1;j<n;j++)
           {
              
               if(array[i]<=array[j])
               {
                   array[i]=array[j];
               }
               
           }
       
       }
        array[n-1]=-1;
        for (int i=0; i<n; i++)
    {
        System.out.printf("%d", array[i]);
if(i<n-1)
        {
        System.out.printf(" ");
        }
    }

    }
}