
import java.util.Scanner;
public class CSIE_41343124_0926_3{
  public static void main (String args[]){
    int S41343124=0;
    while(true) {
     Scanner scn = new Scanner(System.in); 
     S41343124=scn.nextInt();                      
     if(S41343124>60){                             
     System.out.println("及格");             
     }
     else if(S41343124<60 && S41343124>=50){
     System.out.println("補考"); 
     }
     else{
     System.out.println("不及格"); 
     }
    }
  }
}