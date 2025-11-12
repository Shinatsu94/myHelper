import java.util.Scanner;

public class csie_41343150_1017_3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入一個整數: ");
        int num = scanner.nextInt();
        
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10; 
            reversed = reversed * 10 + digit;  
            num = num / 10; 
        }
        
        System.out.println("反轉後的數字為: " + reversed);
        scanner.close();
    }
}
