import java.util.Scanner;
public class CSIE_41245139_1003_1{
    public static void main(String[] args){
       Scanner sca=new Scanner(System.in);        
       int A= sca.nextInt();
       int B= sca.nextInt();
      
       A = A + B;
       B = A - B;
       A = A - B;
       System.out.println(A);
       System.out.println(B);

       sca.close();

   }
}