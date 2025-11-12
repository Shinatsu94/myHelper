import java.util.Scanner;
public class csie_41343239_1003_1{
  public static void main(String[] args){
   Scanner sc =new Scanner(System.in);
   int a = sc.nextInt();
   int b = sc.nextInt();
   a=a^b;
   b=a^b;
   a=a^b;
   System.out.print(a+"\n"+b);
  
   sc.close();
  }
}

