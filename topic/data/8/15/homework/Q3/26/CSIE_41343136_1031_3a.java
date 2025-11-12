import java.util.Scanner;
public class CSIE_41343136_1031_3a
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
	if(n>20)
	{
		System.out.print("超過20");
		return;
	}
	char array[][]=new char[n][];
	for(int i=0;i<array.length;i++)
	{
		array[i]=new char[i+1];
	}
	for (int i = 0; i < array.length; i++) 
	{
    		for (int j = 0; j < array[i].length; j++) 
		{
       			array[i][j] = '*';
    		}
	}
	for(int i=0;i<array.length;i++)
	{
		for(int j=0;j<array[i].length;j++)
		{
			System.out.print(array[i][j]);
		}
		System.out.print("\n");
	}
    }
}