import java.util.Scanner;

public class CSIE_41343226_1017_2 {
    public static void main(String[] args) {
		Scanner myObj=new Scanner(System.in);
			int num = myObj.nextInt();
			int ans=num;
			int c=2;
			int tmp=10;
			while(num>0){
				int now=num%10;
				num/=10;
				if (tmp>now){
					tmp=now;
					continue;
				}
				else{
					c=1;
					break;
				}
			}
			if(c==2){
				System.out.printf("%d is well-ordered number.%n",ans);
			}
			else{
				System.out.printf("%d is not well-ordered number.%n",ans);
			}
	}
}