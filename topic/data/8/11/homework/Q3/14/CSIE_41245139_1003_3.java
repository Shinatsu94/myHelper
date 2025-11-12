import java.util.Scanner;
public class CSIE_41245139_1003_3{
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        int A = sca.nextInt();
        int count=0;
        for(int i=0;i<=100000;i++){
            if(digitSum(i)==A){
               count++;         
         }
      }

        System.out.println(count);
   }
public static int digitSum(int number) {
   int sum=0;
   while(number>0){
      sum+=number%10;
      number/=10;
   }
   return sum;
}
}