import java.util.Scanner;
public class CSIE_41343101_1003_3{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int t=0;
for(int i=0;i<=100000;i++){
  int sum=0, a=i;
  while(a!=0){
    sum+=(a%10);
    a/=10;
  }
  if(sum==n) {t++;}
}
System.out.println(t);
  }
}