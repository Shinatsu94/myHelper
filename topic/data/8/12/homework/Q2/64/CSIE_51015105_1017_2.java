import java.util.Scanner;
    

public class CSIE_51015105_1017_2
{
    
    public static boolean wo_resuli(int n) {
        int last=0,now=0;
        while(true){
            last=n%10;
            n/=10;
            now=n%10;
            if(now>=last) return false;
            if(n<10) break;
        }
        return true;
    }
    
	public static void main(String[] args) {
	    
	   Scanner input = new Scanner(System.in);
	   int n = input.nextInt();
	   
	   if(wo_resuli(n)){
	       System.out.printf("%d is well-ordered number.", n);
	   }
	   else{
	       System.out.printf("%d is not well-ordered number.", n);
	   }
	   
	}
}
