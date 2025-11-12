import java.util.Scanner;

public class CSIE_41343231_0926_3{
	public static void main(String[] args){
	
	Scanner secore = new Scanner(System.in);

	
		int scr = secore.nextInt();

		if (scr >= 60){
			System.out.println("及格");

		}else if ((scr < 60) && (scr >= 50 )){
			System.out.println("補考");

		}else if (scr < 50 ){
			System.out.println("不及格");
		}


		

			
	}

}



