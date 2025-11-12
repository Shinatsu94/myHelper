import java.util.Scanner;
public class CSIE_41343119_1017_2{
  public static void main(String args[])
    
{
     Scanner scn=new Scanner(System.in); 
    int n,max,i;
    n=scn.nextInt();
    i=n/10;
    max=n%10;
    while(i>0){  
      if(i%10>=max){
        System.out.println(n + " is not well-ordered number.");

        break;
        }
      else {
      max=i%10;
      i=i/10;

    }
    if(i<=0)System.out.println(n + " is well-ordered number.");}

}
}
/*姓名 金宗翰
  學號 41343119
  功能 判斷WellNumber
  日期 2025/10/03
*/