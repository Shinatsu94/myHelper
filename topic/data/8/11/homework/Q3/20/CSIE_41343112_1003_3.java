import java.util.Scanner;
public class CSIE_41343112_1003_3{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int T=0;
for(int i=0;i<=100000;i++){
int Sum=0,a=i;
while(a!=0){
Sum+=(a%10);   
a/=10;
   }
if(Sum==n)T++;
  }
System.out.println(T); 
 }
}
 
  