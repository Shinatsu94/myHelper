import java.util.Scanner;
public class csie_41343239_1003_3{
   public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int x = sc.nextInt();
    int coun=0,s,a,b,c,d,e,f,z;				
     for(int i=1;i<=100000;i++){
       s=i;
       f=s/100000;
       s%=100000;
       e=s/10000;
       s%=10000;
       d=s/1000;
       s%=1000; 
       c=s/100;
       s%=100;
       b=s/10;
       s%=10; 
       z=s+b+c+d+e+f;
       if(z==x) coun++;
      }
    System.out.print(coun);	
    sc.close();
  }
}
