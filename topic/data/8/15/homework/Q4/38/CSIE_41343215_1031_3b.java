import java.util.Scanner;
public class CSIE_41343215_1031_3b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = scanner.nextInt();
        scanner.close(); 
        int maxNumInArray = (n * (n + 1)) / 2;
        if (num > maxNumInArray || num < 1) {
            System.out.println("not find " + num + " in array.");
            return; 
        }
        int counter = 1; 
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                if (counter == num) {
                    System.out.println(num + "[" + row + ", " + col + "]");
                    return; 
                }
                counter++;
            }
        }
    }
}

