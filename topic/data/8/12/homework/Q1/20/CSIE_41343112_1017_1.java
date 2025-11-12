public class CSIE_41343112_1017_1{
	public static void main(String arg[]){
	

	for(int j=10000;j<=100000;j+=10000){
		double sum=0;
		int sing=1;
		
		for(int i=1;i<=j;i++){
			
			sum+=4*sing*1.0/(2*i-1);
			sing=-sing;	
				}
			if(sum>3.14159)System.out.printf("%ni =  %d", j);
			if(j<=90000)System.out.printf("i =  %d, pi = %.10f%n", j,sum);
			else System.out.printf("i = %d, pi = %.10f%n", j,sum);


		}
	double sum=0;
	int sing=1;
	int i=0;
	while(sum<=3.14159 || sum>=3.14160){
		i++;
		sum+=4*sing*1.0/(2*i-1);
		sing=-sing;
	
		}
	System.out.printf("%ni = %d", i);
	}
}
