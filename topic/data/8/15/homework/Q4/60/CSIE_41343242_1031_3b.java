import java.util.Scanner;

public class CSIE_41343242_1031_3b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  
        int num = sc.nextInt(); 
        if (n <= 0 || num <= 0 || num >= 100000) {
            sc.close();
            return;
        }

  
        int[][] triangle = new int[n][];
        int value = 1;

        for (int i = 0; i < n; i++) {
            triangle[i] = new int[i + 1]; 
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = value++;
            }
        }


        int maxValue = n * (n + 1) / 2;

        if (num > maxValue) {
            System.out.println("not find " + num + " in array.");
        } else {

            int row = 0, col = 0;
            boolean found = false;
            for (int i = 0; i < n && !found; i++) {
                for (int j = 0; j <= i; j++) {
                    if (triangle[i][j] == num) {
                        row = i + 1; 
                        col = j + 1; 
                        found = true;
                        break;
                    }
                }
            }
            System.out.println(num + "[" + row + ", " + col + "]");
        }

        sc.close();
    }
}
