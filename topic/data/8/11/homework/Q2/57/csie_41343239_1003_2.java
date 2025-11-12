import java.util.Scanner;
public class csie_41343239_1003_2{
  public static void main(String[] args){
   Scanner sc =new Scanner(System.in);
   //System.out.print("請輸入a:");
   int a = sc.nextInt();
   //System.out.print("請輸入b:");
   int b = sc.nextInt();
   //System.out.print("請輸入c:");
   int c = sc.nextInt();
   int max,mid,min;
   max=(a>b)&&(a>c)?a:(b>c)?b:c;
   min=(a<b)&&(a<c)?a:(b<c)?b:c;
   mid=(a+b+c)-(max+min);
   System.out.print(min+"\n"+mid+"\n"+max);				
  
   sc.close();
  }
}



