import java.util.Scanner;
public class CSIE_41343233_1017_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numi=in.nextInt();
        int numo=0;
        boolean i=true;
        while(numi!=0){
            numo=(numo*10)+numi%10;
            numi=numi/10;
        }
        System.out.println(numo);   
    }
}
