import java.util.Scanner;
public class CSIE_41343233_1017_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numi=in.nextInt();
        int numo=numi;
        boolean i=true;
        while(numi>9){
            int a=0,b=0;
            a=numi%10;
            numi=numi/10;
            b=numi%10;
            numi=numi/10;
            if(a>b) i=true;
            else i=false;
        }
        if(i){
        System.out.println(numo+" is well-ordered number.");
        }
        else{
        System.out.println(numo+" is not well-ordered number.");
        }   
    }
}
