import java.util.Scanner;

public class CSIE_41343226_1017_3 {
    public static void main(String[] args) {
		Scanner myObj=new Scanner(System.in);
			int num = myObj.nextInt();
			int ans=0;
			while(num>0){
				int now=num%10;
				num/=10;
				ans=ans*10+now;
			}
			System.out.println(ans);
	}
}