import java.util.Scanner;

public class CSIE_51015130_1017_2{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int s= sc.nextInt();
		int a1=0, a2, x, y; 
		
		while(s!=0){
			x=s; y=0; a2=10; 
			while(x!=0){
				a1=x%10;//System.out.print(a1+" ");System.out.println(a2);

				//a2為後一位數，a1必須小於a2
				if(a1>=a2){
					System.out.println(s+ " is not well-ordered number.");
					y++;	//y不等於0說明此樹不為well-ordered number
				}

				a2=a1;
				x=x/10;
			}
		
			if(y==0){System.out.println(s+ " is well-ordered number.");}
			s=0;s= sc.nextInt();
		}		
	}
}




/*(b)
public class CSIE_51015130_1017_2{
	public static void main(String[] args){

		int a1=0, a2, x, y, sum=0;
	
		for(int i=1;i<100000;i++){
			x=i; y=0; a2=10; 
			while(x!=0){
				a1=x%10;
				if(a1>=a2) y++;

				a2=a1;
				x=x/10;
			}
		
			if(y==0) sum++;
		}
		System.out.println(sum);	
	}
}*/
