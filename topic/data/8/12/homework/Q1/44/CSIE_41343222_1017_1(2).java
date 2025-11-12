import java.util.Scanner;
public class CSIE_41343222_1017_1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int number=100000;
		double total=0;
		for(int e=1;e<=number;e++){
			if(e%2==1) total=total+(1.0/(e*2-1));
			else total=total-(1.0/(e*2-1));
			if(e%10000==0)	System.out.printf("i = %6d, pi = %.10f\n",e,total * 4);
		}
		int e=100001;
		while(true){
			if(e%2==1) total=total+1.0/(e*2-1);
			else total=total-1.0/(e*2-1);	
			int apple=(int)(total*4*100000);
			if(apple==314159) {//total*4>=3.14159&&
				System.out.printf("\ni = %6d",e);
				break;
			}
			e++;
		}
	}
}