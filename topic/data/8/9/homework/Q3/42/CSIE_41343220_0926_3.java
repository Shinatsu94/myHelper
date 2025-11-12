import java.util.Scanner;
public class CSIE_41343220_0926_3 {
    public static void main(String[] args) throws InterruptedException {
	Scanner s=new Scanner(System.in);
	while(true)
	{
	   int grade = s.nextInt();
	   if(grade<50)
	   {System.out.println("不及格");}
	   else if(grade>=50&&grade<60)
	   {System.out.println("補考");}
           else if(grade>=60)
	   {System.out.println("及格");}
	}
    }
}
