
import java.util.Scanner;

public class CSIE_41343241_1003_1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int dataa = sc.nextInt();
        int datab = sc.nextInt();
        //swap without temp using xor
        dataa = dataa ^ datab;
        datab = dataa ^datab;
        dataa = dataa ^datab;
        System.out.println(dataa);
        System.out.println(datab);
        sc.close();
    }
}
