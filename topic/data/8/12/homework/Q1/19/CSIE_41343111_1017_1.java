public class CSIE_41343111_1017_1{
    public static void main(String[] args) {
        for(int i=10000;i<=100000;i+=10000){
            double T=1;
            for(int j=2;j<=i;j++){
                if(j%2==0)
                    T-=1.0/(2*j-1);
                else
                    T+=1.0/(2*j-1);
            }
            T*=4;
            System.out.printf("i = %6d, pi = %.10f%n",i,T);
        }
        int i=100001;
        while(true){
            i+=10;
            double T=1;
            for(int j=2;j<=i;j++){
                if(j%2==0)
                    T-=1.0/(2*j-1);
                else
                    T+=1.0/(2*j-1);
            }
            T*=4;
            if(T>=3.14159 && T<3.1416){
                System.out.printf("%ni = %6d%n",i);
                break;
            }
        }
    }
}