import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int max = (num1 > num2 && num1 > num3) ? num1 : (num2 > num1 && num2 > num3) ? num2 : num3;
        int min = (num1 < num2 && num1 < num3) ? num1 : (num2 < num1 && num2 < num3) ? num2 : num3;
        int mid = (num1+num2+num3) - (max+min);
        System.out.printf("%d\n%d\n%d\n", min, mid, max);
    }
}