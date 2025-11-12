import java.util.Scanner;
public class CSIE_41343136_1031_1
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
	int arr[] = new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i] =s.nextInt();

	}
	for(int i=0;i<n;i++)
	{
		for(int j=i;j<n;j++)
		{
			if(arr[i]>arr[j])
			{
				arr[i]=arr[i]+arr[j];
				arr[j]=arr[i]-arr[j];
				arr[i]=arr[i]-arr[j];
			}
		}

	}
	for(int i=0;i<n;i++)
	{
		System.out.print(arr[i]);
		if(i!=n-1)System.out.print(" ");
	}
    }
}