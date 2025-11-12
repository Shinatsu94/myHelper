import java.util.Scanner;
public class CSIE_41343101_1031_3b {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n=sc.nextInt();
          int tar=sc.nextInt();
          int a=0;
          int old=0;
          for (int i = 1; i <= n;i++) {
            a+=i;
            if (tar<=a) {
               System.out.printf("%d[%d, %d]",tar,i,tar-old);
               break;
            }
            else if (i==n) System.out.printf("not find %d in array.",tar);
            old=a;
          }
    }
}
