/**
     * 作者：彭裕軒
     * 程式目的：讀入使用者輸入的分數，根據分數輸出此分數為：及格、補考、不及格
     * 日期：2025-09-26 
     */
import java.util.Scanner;
public class csie_51015114_0926_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (; sc.hasNextInt(); ) {
            int input_score = sc.nextInt();
            if (input_score >= 60) {
                System.out.println("及格");
            } else if (input_score >= 50) {
                System.out.println("補考");
            } else {
                System.out.println("不及格");
            }
        }

        sc.close();
    }
}