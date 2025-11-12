import java.util.Scanner;
public class CSIE_41343203_0926_3{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);

		while(sc.hasNextInt()){

			int score=sc.nextInt();
			if(score>=60){
				System.out.println("及格");
			}
			else if(score>=50){
				System.out.println("補考");
			}
			else{
				System.out.println("不及格");
			}
		}
	sc.close();
	}
}