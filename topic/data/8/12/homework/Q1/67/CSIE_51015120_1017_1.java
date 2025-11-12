public class CSIE_51015120_1017_1
{
	public static void main(String[] args) {
		
		double pi;
		//1a
		for(int i=9999;i<=100000;i+=10000)
		{
		    double sum=0.0;
		    //公式
		    for(int k=0;k<=i;k++)
		    {
		        sum=sum+((k%2==0)? 1.0:-1.0)/(k*2.0+1);
		    }
		    pi=4.0*sum;
		    System.out.printf("i = %6d, pi = %.10f%n", i+1, pi);
		}
		double sum = 0.0;
        int i = 0;
        pi = 0.0;
        
        while (true) {
            sum += ((i % 2 == 0) ? 1.0 : -1.0) / (2.0 * i + 1.0);
            pi = 4.0 * sum;
            double roundedPi = Math.round(pi * 100000.0) / 100000.0; 
            if (roundedPi == 3.14159) {
                break;
            }
            i++;
        }
        
        System.out.printf("i = %d, pi = %.5f%n", i, pi);
	}
}
