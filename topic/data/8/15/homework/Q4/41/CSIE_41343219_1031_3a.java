import java.util.Scanner;

public class  CSIE_41343219_1031_3a {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int find = sc.nextInt(); 
        sc.close();
        
        for(int i=0;i<n;i++) 
        {
            for(int j=0;j<=i;j++)
            {
                if(find == 1 + i*(i+1)/2 + j)
                {
                    System.out.println(find+"["+(i+1)+", "+(j+1)+"]");
                    return;
                }
            }
        }
        System.out.println("not find "+find+" in array.");
    }
}