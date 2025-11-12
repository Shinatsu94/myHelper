
import java.util.Scanner;

public class CSIE_41343241_1017_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean iswell = false;
        int get =10,out = n;
        while(n%10>0){
            if(get>n%10){
                get = n%10;
                iswell=true;
                n/=10;
            }
            else{
                System.out.print(out+" is not well-ordered number.");
                iswell = false;
                break;
            }
        }
        if(iswell){
            System.out.print(out+" is well-ordered number.");
        }
    }
}
