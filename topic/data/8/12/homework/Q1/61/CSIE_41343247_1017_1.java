/*
Name:盧冠宇
Student_ID:41343247
*/
public class CSIE_41343247_1017_1 {
    public static void main(String[] args) {
        double pi = 0.0;
        for (int i = 0; i < 1000000; i++) {
            double term = 4.0 / (2 * i + 1);
            if (i % 2 == 1) {
                pi -= term;
            } else {
                pi += term;
            }
            if ((i + 1) % 10000 == 0 &&(i + 1) <= 100000) {
                System.out.printf("i = %6d, pi = %.10f\n", i + 1, pi);
            }
	    else if((int)(pi*100000)==314159){System.out.printf("\ni = %6d", i + 1);break;}
        }
    }
}
