
import java.util.Scanner;

public class CSIE_41343241_1003_3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int count=0;
        for(int i=0;i<=100000;i++)
        {
            int temp = i;
            int total=0;
            while(temp>0)
            {
                total+=temp%10;
                temp/=10;
            }
            total+=temp;
            if(total==a)
                count++;
        }
        System.out.println(count);
        /*for(int i=0;i<100000;i++)
        {
            int temp = i;
            int total=0;
            int count=0;
            while(temp>10)
            {
                total+=temp%10;
                temp/=10;
            }
            total+=temp;
            if(total==a)
                System.out.println(i);
        }*/
    }
}
