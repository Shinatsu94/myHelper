//package h4w;
import java.util.Scanner;

public class CSIE_41143122_1003_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //System.out.printf("請輸入3值：");
        int scn1 = scanner.nextInt();
        int scn2 = scanner.nextInt();
        int scn3 = scanner.nextInt();
        //System.out.println("scn1="+scn1+" , scn2="+scn2+" , scn3="+scn3);
        int max= scn1 < scn2 ? (scn2 < scn3 ? scn3 : scn2) : (scn1 < scn3 ? scn3 : scn1);
        //System.out.println("最大值="+max);
        int min= scn1 > scn2 ? (scn2 > scn3 ? scn3 : scn2) : (scn1 > scn3 ? scn3 : scn1);
        //System.out.println("最小值="+min);
        int mid= (scn1<max)&(scn1>min) ? scn1: (scn2<max)&(scn2>min) ? scn2 : scn3;
        //System.out.println("中間值="+mid);
        System.out.println(min);
        System.out.println(mid);
        System.out.println(max);
    }
}
