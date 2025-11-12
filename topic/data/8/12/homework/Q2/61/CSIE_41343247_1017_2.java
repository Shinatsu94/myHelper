/*
Name:盧冠宇
Student_ID:41343247
*/
import java.util.Scanner;
public class CSIE_41343247_1017_2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n,ex=0,good=0,m;
		n=scanner.nextInt();
		m=n;
		for(int i=1;i<=10;i++){
			m/=10;
			if(m==0){ex=i;break;}
		}
		for(int i=1;i<ex;i++){
			if(n%Math.pow(10,i)>n%Math.pow(10,i+1)/10)good++;
		}
		if(good==ex-1)System.out.println(n+" is well-ordered number.");
		else System.out.println(n+" is not well-ordered number.");
	}
}