import java.util.Scanner;
public class CSIE_41343222_1031_4{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int rows=scanner.nextInt();
		int goal=scanner.nextInt();
		int e=0;
		int column=0;
		int total=0;
		for(int y=0;y<rows;y++){
			total=total+y+1;
			if(total>=goal){
				e=y+1;
				column=e+1-(total-goal);
				System.out.print(""+goal+"["+e+", "+column+"]");
				break;
			}
			if(y==rows-1)System.out.print("not find "+ goal+" in array.");
		}
		
	}
}