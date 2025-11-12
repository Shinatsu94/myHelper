import java.util.Scanner;

public class CSIE_41343219_1017_2a{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine(); sc.close();
        char[] num = in.toCharArray();

        int tmp = num[0] - '0';
        int i = 1;
        for(;i<num.length&&tmp<num[i] ;i++)
            tmp = num[i];

        System.out.print(in);
        if(i!=num.length) System.out.println(" is not well-ordered number.");
        else System.out.println(" is well-ordered number.");
    }
}