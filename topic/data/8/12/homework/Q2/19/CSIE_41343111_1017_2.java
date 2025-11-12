import java.util.Scanner;
public class CSIE_41343111_1017_2{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int in=s.nextInt(),x;
        boolean F=true;
        System.out.print(in+" is ");
        while(in>9){
            x=in%10;
            in/=10;
            if(x<=in%10){
                F=false;
                break;
            }
        }
        if(!F)
            System.out.print("not ");
        System.out.println("well-ordered number.");
    }
}