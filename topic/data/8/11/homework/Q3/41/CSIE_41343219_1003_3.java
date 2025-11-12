import java.util.Scanner;

public class CSIE_41343219_1003_3 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int in = sc.nextInt();
            int i=1, count=0;
            while(i<=100000)
            {
                int check=0;
                int tmp = i++;
                while(tmp!=0)
                { 
                    check += tmp % 10;
                    tmp /= 10;
                }
                if(check==in) count++;
            }
            System.out.println(count);
    }
}
