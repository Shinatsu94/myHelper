import java.util.Scanner;  
public class CSIE_41343232_1003_1
{
	public static void main(String[] args){
	  Scanner scan = new Scanner(System.in);
	  
	  int a= scan.nextInt();
	  int b= scan.nextInt();
	  int c= scan.nextInt();
	  int max=(a>b)?(a>c)?a:c:(b>c)?b:c;
	  int min=(a<b)?(a<c)?a:c:(b<c)?b:c;
 	  int mid = ((a>b && b>c) || (c>b&&b>a)) ? b:((a>c && c>b) || (c>a && c<b))?c:a;
	  System.out.println(min);
	  System.out.println(mid);
	  System.out.println(max);
	  scan.close();
	}
}
	  