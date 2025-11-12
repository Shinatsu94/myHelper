import java.util.Scanner;
public class CSIE_41343112_1003_1{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
//System.out.println(a);
//System.out.println(b);
a=a^b;
b=a^b;
a=a^b;
System.out.println(a);
System.out.print(b);
 }
}