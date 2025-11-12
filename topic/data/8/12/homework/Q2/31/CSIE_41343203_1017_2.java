import java.util.Scanner;
public class CSIE_41343203_1017_2 {
	 public static void main(String[] args) {
	Scanner input=new Scanner(System.in);

	int num=input.nextInt();

	String s=Integer.toString(num);
	boolean ans=true;
	for(int i=0;i<s.length()-1;i++){
		if(s.charAt(i)>=s.charAt(i+1)){
			ans=false;
			break;
		}
	}
	if(ans)
	System.out.print(num+" is well-ordered number.");
	else
	System.out.print(num+" is not well-ordered number.");
	}
}
