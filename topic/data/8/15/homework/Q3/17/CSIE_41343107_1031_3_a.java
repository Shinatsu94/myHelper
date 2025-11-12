import java.util.Scanner;

public class CSIE_41343107_1031_3_a {
    public static void main(String args[]) {
        Scanner same = new Scanner(System.in);
        int n = same.nextInt();        
	char a[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                a[i][j] = '*';
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]);
            }
            if(i!=n-1) System.out.println();
        }
    }
}

/*
 姓名: 王世豪
 學號: 41343107
 功能: 高度 n 由使用者輸入，其中 0<n<=20，寫一程式將此三角形以 '*' 符號顯示在螢幕上
 日期: 2025/10/31
*/