import java.util.Scanner;

public class csie_1031_41343214_3b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int n = sc.nextInt();

  
        int[][] arr = new int[n][];
        int numCount = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = new int[i + 1]; 
            for (int j = 0; j <= i; j++) {
                arr[i][j] = numCount++;
            }
        }


        int num = sc.nextInt();

    
        boolean found = false;
        int foundRow = -1;
        int foundCol = -1;

        outer:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (arr[i][j] == num) {
                    foundRow = i + 1; 
                    foundCol = j + 1; 
                    found = true;
                    break outer;
                }
            }
        }

        if (found) {
            System.out.printf("%d[%d, %d]\n", num, foundRow, foundCol);
        } else {
            System.out.printf("not find %d in array.\n", num);
        }

        sc.close();
    }
}
