import java.util.Scanner;
class CSIE_51015114_1003_2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt() ;
    int b = scanner.nextInt() ;
    int c = scanner.nextInt() ;
    int max,mid,min ;
    max=a>b?a:b;
    max=max>c?max:c;
    min=a<b?a:b;
    min=min<c?min:c;
    System.out.println(min);
    System.out.println((a+b+c)-(max+min));
    System.out.println(max);
    }
}
      
