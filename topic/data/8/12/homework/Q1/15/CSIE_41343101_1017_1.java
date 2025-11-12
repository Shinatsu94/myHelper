public class CSIE_41343101_1017_1 {
    public static void main(String[] args) {

          for (int j = 10000; j <= 100000; j += 10000) {
            double s = 0;
            int a = 1;
            for(int i=1;i<=j;i++){
              s+=4*a*1.0/(2*i-1);
              a=-a;
            }
            if(j<=90000)System.out.printf("i =  %d, pi = %.10f%n", j, s);
            else System.out.printf("i = %d, pi = %.10f%n", j, s);
        }
        double s=0;
        int a=1;
        int i=0;
        while(s<=3.14159 || s>=3.14160){
          i++;
          s+=4*a*1.0/(2*i-1);
          a=-a;
        }
        System.out.printf("%ni = %d",i);
    }
}
