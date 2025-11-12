import java.util.Scanner;
public class CSIE_41343222_0926_3{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("請輸入你的成績:");
		int score=scanner.nextInt();
		if(score>=60){
		System.out.println("及格");
		}else if(score>=50&&score<60){
		System.out.println("補考");}
		else if(score<50){
		System.out.println("不及格");}
		scanner.close();
	}
}  
		
		