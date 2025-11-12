import java.util.Scanner;
public class CSIE_41343226_1003_3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int goal = scn.nextInt();
	scn.close(); 
	int count=0;
	for(var tmp=1;tmp<=100000;tmp++){
		int check=0;
		int i=tmp;
		while(i>0){
			check+=i%10;	
			i=(i-i%10)/10;
		}
		if(check==goal){
			count++;
		}
	}
	System.out.println(count);
    }
}