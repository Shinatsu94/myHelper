import java.util.Scanner;

class test{
    private static int F1(int n) {
        return F1(n, 0);
    }
    private static int F1(int n, int a) {
        int result = 0;
        while(n != 0) {
            int t = n % 10;
            result *= 10;
            result += t + a;
            n /= 10;
        }
        
        return result;
    }
    
    public static void main(String argsl[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        
        int ans = F1(num, 1);
        ans = F1(ans);
        
        System.out.println(ans);
    }
}
