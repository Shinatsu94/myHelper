import java.util.Scanner;
public class CSIE_41245139_1017_3{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       sc.close();
       int reversed=0;
       while(num>0){
          int dight=num%10;
          reversed =reversed*10+dight;
          num/=10;  
      }       

        System.out.println(reversed);
   }
}