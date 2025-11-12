/*
Name:盧冠宇
Student_ID:41343247
*/
import java.util.Scanner;
public class CSIE_41343247_0926_3{
	public static void main(String[] args){
		for(int n=3;n>0;n--){
			Scanner scanner = new Scanner(System.in);
			System.out.print("輸入分數: ");
			int num=scanner.nextInt();
			if(num>=60)System.out.println("及格");
			else if(num<60 && num>=50)System.out.println("補考");
			else System.out.println("不及格");
		}
	}
}