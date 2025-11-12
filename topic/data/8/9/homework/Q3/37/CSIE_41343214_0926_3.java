import java.util.Scanner;
public class csie_0926_41343214_3{
public static void main(String[] args)   {
Scanner scn =new Scanner(System.in);

System.out.print("輸入分數:");
   
int a=scn.nextInt();
if(a>=60){
System.out.print("及格");
}
else if((a>=50)&&(a<60)){
System.out.print("補考");
}
else if(a<50)
{
System.out.print("不及格");
}


   
    }
}