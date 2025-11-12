import java.util.Scanner;
    

public class CSIE_51015105_1017_3
{
	public static void main(String[] args) {
	    
	   Scanner input = new Scanner(System.in);
	   int n = input.nextInt();
	   int a=0;
	   while(n>0){
	   a=n%10;
	   n/=10;
	   if(a>0) System.out.printf("%d",a);
	   }
	}
}
