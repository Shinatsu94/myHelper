//import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.print("請輸入一個整數: ");
        int num = scanner.nextInt();
        scanner.close();

        // 運算
        int count = 0;
        int t1,t2;
        for (int i=1; i<=100000; i++) {
            t1 = i;
            t2 = 0;
            while(t1 != 0) {
                t2 += t1 % 10;
                t1 /= 10;
            }
            if (num == t2) {
                count++;
                //System.out.println(i);
            }
        }


        // 輸出
        System.out.println(count);
    }
}