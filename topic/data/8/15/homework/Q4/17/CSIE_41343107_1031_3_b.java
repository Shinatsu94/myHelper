import java.util.Scanner;

public class CSIE_41343107_1031_3_b {
    public static void main(String args[]) {
        Scanner same = new Scanner(System.in);
        int n = same.nextInt();
  	int b = same.nextInt();
	int c=1;       
	int a[][] = new int[n][n];
    	for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                a[i][j] = c;
		c++;
            }
            for (int j = i + 1; j < n; j++) {
                a[i][j] = 0;
            }
        }
	boolean found = false;
        for (int i = 0; i < n && !found; i++) {
            for (int j = 0; j <= i; j++) {
                if (a[i][j] == b) {
                    System.out.println(b + "[" + (i + 1) + ", " + (j + 1) + "]");
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("not find " + b + " in array.");
        }

    }
}

/*
 姓名: 王世豪
 學號: 41343107
 功能: 印出此數字與此位置的列編號和行編號，但不用印出三角形內容
 日期: 2025/10/31
*/