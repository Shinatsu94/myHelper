import java.util.Scanner;

public class CSIE_41343221_1031_3b{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N;
        long num;

        if (scanner.hasNextLong()) {
            N = scanner.nextLong();
        } else {
            scanner.close();
            return;
        }

        if (scanner.hasNextLong()) {
            num = scanner.nextLong();
        } else {
            scanner.close();
            return;
        }
        
        long max_num_in_array = N * (N + 1) / 2;

        if (num > max_num_in_array || num <= 0) {
            System.out.println("not find " + num + " in array.");
            scanner.close();
            return;
        }

        long R = 0; 

        while (R * (R + 1) / 2 < num) {
            R++;
        }
        
        long total_nums_up_to_R_minus_1 = (R - 1) * R / 2;
        
        long C = num - total_nums_up_to_R_minus_1;

        System.out.println(num + "[" + R + ", " + C + "]");

        scanner.close();
    }
}