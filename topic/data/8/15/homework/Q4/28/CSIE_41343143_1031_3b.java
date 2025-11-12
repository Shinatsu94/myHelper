import java.util.Scanner;
public class CSIE_41343143_1031_3b{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	int l=input.nextInt();
        int num = input.nextInt();
	int flag=0;
        if (num <= 0 || num >= 100000) {
            System.out.println("wrong");
            return;
        }
        int row = 1;
        while (num > row * (row + 1) / 2) {
	if(row>l)
	{
	System.out.printf("not find %d in array.%n", num);
	flag=1;
	break;
	}
            row++;
        }
	if(flag==0)
	{
        int prevRowSum = (row - 1) * row / 2;
        int col = num - prevRowSum;
        System.out.println(num+"["+row+", "+col+"]");
	}
    }
}
