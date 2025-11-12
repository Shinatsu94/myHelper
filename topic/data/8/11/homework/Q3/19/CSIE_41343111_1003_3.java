import java.util.Scanner;
public class CSIE_41343111_1003_3{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a,T=0;
        a=s.nextInt();
        for(int i=1;i<=100000;i++){
            int t=0,x=i;
            for(int j=0;j<6;j++){
                t+=x%10;
                x/=10;
            }
            if(a==t)
                T++;
        }
        System.out.println(T);
    }
}