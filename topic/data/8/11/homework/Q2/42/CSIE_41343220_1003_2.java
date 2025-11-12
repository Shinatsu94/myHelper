import java.util.Scanner;
public class CSIE_41343220_1003_2
{
   public static void main(String[] args){
	Scanner scn=new Scanner(System.in);
	int x=scn.nextInt();
	int y=scn.nextInt();
	int z=scn.nextInt();
	int max;
	int min;
	boolean f=false;
	boolean t=true;
	max=(x>y)?x:y;
	max=(max>z)?max:z;
	min=(x<y)?x:y;
	min=(min<z)?min:z;
	int mid = x + y + z - max - min;
	System.out.println(min);
	System.out.println(mid);
	System.out.println(max);
   }   		
} 