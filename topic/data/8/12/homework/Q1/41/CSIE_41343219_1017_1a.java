public class CSIE_41343219_1017_1a {
    public static void main(String[] args) {
        // a
        for(int i=10000;i<=100000;i+=10000)
        {
            double Pi = 0;
            for(int j=1;j<=i;j++)
                Pi += j%2!=0 ? 1.0/(2*j-1) : -(1.0/(2*j-1));
            System.out.println("i = " + String.format("%6d",i) + ", pi = " + String.format("%.10f", Pi*4));
        }

        System.out.println();

        // b
        int k = 1;
        double Pi = 0;
        for(;Math.floor(Pi*4*100000.0)/100000.0!=3.14159;k++)
            Pi += k%2!=0 ? 1.0/(2*k-1) : -(1.0/(2*k-1));
        System.out.println("i = " + String.format("%6d",k-1));
    }
}
