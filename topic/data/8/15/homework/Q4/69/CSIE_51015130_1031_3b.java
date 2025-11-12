import java.util.Scanner;
import java.util.Arrays;

public class CSIE_51015130_1031_3b{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int h= sc.nextInt();
		int n= sc.nextInt();
		int n0=0 ,a=1 ,b=0;

		while(h<=0 || h>20){
			System.out.print("\n請重新輸入三角形高度(介於1～20之間):");
			h= sc.nextInt();
		}
		while(n>100000){
			System.out.print("\n請重新輸入(數值必須小於100000):");
			n= sc.nextInt();
		}
		
		//先找出位於第幾行
		while(!(n>n0 && n<=n0+a)){
			n0=n0+a;
			a++;
		}

		//再找出位於第幾列
		while(!(n0==n)){
			n0++;
			b++;
		}

		//先確認找到的位址在規定的三角形範圍內
		if(a<=h && b<=h){System.out.print(n +"[" +a +"]" +"[" +b +"]");}
		else{System.out.print("not find " +n +" in array.");}
	}
}