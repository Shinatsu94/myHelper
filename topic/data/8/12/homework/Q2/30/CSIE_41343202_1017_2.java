import java.util.Scanner;
public class CSIE_41343202_1017_2{
	
	private static boolean ISW(int number){
		String numStr=Integer.toString(number);


		if(numStr.length()==1){
			return true;
		}

		for(int i=0;i<numStr.length()-1;i++){
			int CD=numStr.charAt(i);
			int ND=numStr.charAt(i+1);

			if(CD>=ND){
				return false;
			}
		}

		return true;
	}
	private static void FOD(){
		int count=0;
	
		for(int i=0;i<1000;i++){
			if(ISW(i)){
				System.out.print(i);
				count++;
				if(count%10==0){
					System.out.println();
				}
			}
		}
		System.out.printf("\n總計:"+count+"個");
	}
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
	
		int number=scanner.nextInt();

		if(ISW(number)){
			System.out.println(number+" is well-ordered number.");
		}else{
			System.out.println(number+" is not well-ordered number.");
		}
		scanner.close();
	}
}



		


