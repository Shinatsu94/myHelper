import java.util.Scanner;

public class CSIE_41343124_1017_3{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("");
	int n = sc.nextInt(),rev=0;
while(n != 0){
	rev=rev * 10 + n % 10;
	n /= 10;
}
System.out.println(""+rev);
sc.close();
}  
}