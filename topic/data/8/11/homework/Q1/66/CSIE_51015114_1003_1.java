import java.util.Scanner;
class CISE_51015114_1003_1 {
    public static void main(String[] args) {      
    Scanner scanner = new Scanner(System.in);
     int a = scanner.nextInt() ;
     int b = scanner.nextInt() ;
     a=a^b; //  110 = 101 011 
     b=a^b; //  101 = 110 011
     a=a^b; //  011 = 110 101 
     System.out.println(a);
     System.out.println(b);
    }
}
      
