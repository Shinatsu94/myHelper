import java.util.Scanner;

public class CSIE_41343219_1017_3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine(); sc.close();
        char[] num = in.toCharArray(); 
        for(int i=num.length;i>0;i--)
            if(num[i-1] != '0') System.out.print(num[i-1]);
    }
}