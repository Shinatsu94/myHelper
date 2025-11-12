import java.util.*;

public class CSIE_41343227_1031_3b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int num = sc.nextInt();
        sc.close();

        int total = n * (n + 1) / 2;

        if (num > total || num <= 0) {
            System.out.println("not find " + num + " in array.");
            return;
        }

        int row = 1;
        int count = 1;

    
        while (num > count) {
            row++;
            count += row;
        }

        int start = count - row + 1;   
        int col = num - start + 1;     

        System.out.println(num + "[" + row + ", " + col + "]");
    }
}
