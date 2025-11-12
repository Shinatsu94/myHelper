import java.util.Scanner;
public class CSIE_41245139_1003_2{
   public static void main(String[] args){
      Scanner sca=new Scanner(System.in);
      int a = sca.nextInt();
      int b = sca.nextInt();
      int c = sca.nextInt();

     
      int max=(a>b)?((a>c)?a:c):((b>c)?b:c);
      int min=(a<b)?((a<c)?a:c):((b<c)?b:c);
      int mid= a+b+c-max-min;
      System.out.println(min);
      System.out.println(mid);
      System.out.println(max);
          
      sca.close();
   }
}