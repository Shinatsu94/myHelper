import java.util.Scanner;

public class CSIE_51015130_1003_2{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		
		int max, min, mid;
		max = a>b ? a:b; max = max>c ? max:c;
		min = a<b ? a:b; min = min<c ? min:c;
		mid = (a<max && a>min) ? a:(b<max && b>min) ? b:c;

		System.out.println(min);  //輸出值由小到大排列~
		System.out.println(mid);
		System.out.println(max);		
	}
}