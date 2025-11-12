import java.util.Scanner;
public class CSIE_41343101_1017_2{
  public static void main(String arg[]){
  Scanner scan = new Scanner(System.in);
  int n=scan.nextInt();
  int j=n%10;
  boolean state=true;
  for(int i=n/10;i>0;i/=10){
    if(j<=i%10)state=false;
    j=i%10;
  }
  if(state) System.out.println(n+" is well-ordered number.");
  else System.out.println(n+" is not well-ordered number.");
  }
}