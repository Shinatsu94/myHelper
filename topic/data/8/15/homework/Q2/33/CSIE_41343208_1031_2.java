import java.util.Scanner;

public class CSIE_41343208_1031_2
{
    public static void main(String[] args)
    {
	Scanner sc = new  Scanner(System.in);
	int n = sc.nextInt();

	int [] arr = new int[n];

	for (int i = 0; i < n; i++) 
	{
            arr[i] = sc.nextInt();
        }
	for (int i = 0; i < n-1; i++)
	{
	    int max = arr[i+1];
	    for (int j = i + 1; j < n; j++)
	    {
		if(arr[j]>max)
		{
		    max = arr[j];
		}
	    }
	    arr[i] = max;
	}
	arr[n-1] = -1;
	
	for(int i = 0;i < n-1; i++)
	{
	    System.out.print(arr[i] + " ");
	}
	System.out.println(arr[n-1]);

    }
}
