
import java.util.*;

public class PiLeibniz {
    // 回傳近似值
    public static double piLeibniz(long n) {
        double sum = 0.0;
        for (long k = 0; k < n; k++) {
            double term = 1.0 / (2 * k + 1);
            if ((k & 1) == 1) term = -term;   
            sum += term;
        }
        return 4.0 * sum;
    }

    public static void main(String[] args) {
        for (long n = 10_000; n <= 100_000; n=n+10000) {
            double approx = piLeibniz(n);
            System.out.printf("i = %6d, pi = %.10f%n", n, approx);
        }	
 System.out.printf("%n");
        for (long n = 13_6100; n <= 100000_000; n=n+1) {
            double approx = piLeibniz(n);
            if(approx==3.1415999999)
		{
		 System.out.printf("i = %6d, pi = %.10f%n", n,approx);
			break;
        	}
	}
		
    }
}
