import java.util.Scanner;
public class CSIE_41343111_1031_3b{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),in=s.nextInt(),i=1,j,T=0;
        while(true){
            for(j=1;j<=i;j++){
                T++;
                if(T==in){
                    System.out.printf("%d[%d, %d]",in,i,j);
                    return;
                }
            }
            i++;
            if(i>n){
                System.out.printf("not find %d in array.",in);
                return;
            }
        }
    }
}