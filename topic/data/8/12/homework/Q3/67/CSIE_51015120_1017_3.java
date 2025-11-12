import java.util.Scanner;

public class CSIE_51015120_1017_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int a = number;
        int answer = 0;
        while(a!=0)
        {
            int nownumber = a%10;
            answer = answer*10+nownumber;
            a=a/10;
        }
        
        System.out.printf("%d%n",answer);
    }    
}
