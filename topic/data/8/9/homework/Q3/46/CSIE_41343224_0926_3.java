/**
 * 程式名稱 : 成績判斷
 * 
 * 功能說明：
 *   讀入使用者輸入的分數，根據分數輸出此分數為：及格、補考、不及格，其中分數 score
 *
 * 日期:2025/09/26
 *
 * 姓名:張竣傑
 *	
 * 學號:41343224
 * 
 * 請給我100分!!
 */
import java.util.Scanner;

public class CSIE_41343224_0926_3{
	
	public static void main(String[] args){

		Scanner scn=new Scanner(System.in);

		int score = scn.nextInt();

		if (score>=60)
			System.out.println("及格");
		else if ((score<60) && (score>=50))
			System.out.println("補考");
		else
			System.out.println("不及格");
	}

}