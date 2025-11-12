public class CSIE_41343209_1017_1{
	public static void main(String[] args) {
		int a=0,g=0;
		double p=0.0;
		for(int j=10000;j<=100000;j+=10000){
			boolean b=false;
			double sum=0.0;
			for(int i=1;i<=j*2;i+=2){
				if(b){
					sum -= 1.0 / i;
				}
				else{
					sum += 1.0 / i;
				}
				b=!b;
				double pi=4*sum;
				if(pi>=3.14159){
				a=i;
				p=pi;
			}

			}
			double pi=4*sum;
            		System.out.printf("i =%7d, pi = %.10f\n", j, pi);
		}
		System.out.printf("i =%7d, pi = %.10f\n", a, p);
	}
}