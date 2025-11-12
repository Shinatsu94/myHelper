public class CSIE_41343205_0926_2{
	public static void main(String[] args)throws InterruptedException{
		char[] spinner={'|','/','-','\\'};
		int i=0;
		int prog=0;
		int max=100;
	while(prog<100){
		for(char c:spinner){
			System.out.print("\r"+spinner[i% spinner.length]);
			i++;
			Thread.sleep(100);
		}
		if(i%10==0 && prog<max){
			prog+=20;
			System.out.print(prog+"%");
		}
	}
	}
}