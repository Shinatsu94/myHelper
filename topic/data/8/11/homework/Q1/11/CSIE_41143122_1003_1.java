//package h4w;
import java.util.Scanner;

public class CSIE_41143122_1003_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //System.out.printf("請輸入2值：");
        int scn1 = scanner.nextInt();
        int scn2 = scanner.nextInt();
        //System.out.println("scn1="+scn1+" , scn2="+scn2);
        scn1=scn1^scn2;
        scn2=scn1^scn2;
        scn1=scn1^scn2;
        //System.out.println("交換後：scn1="+scn1+" , scn2="+scn2);
        System.out.println(scn1);
        System.out.println(scn2);
    }
}
