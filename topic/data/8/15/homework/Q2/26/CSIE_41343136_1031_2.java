import java.util.Scanner;
public class CSIE_41343136_1031_2
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
		if(i!=n-1) arr[i]=arr[i+1];
		for(int j=i+1;j<n;j++)
		{
			if(arr[i]<arr[j])
			{
				arr[i]=arr[j];
			}
		}

	}
	arr[n-1]=-1;
	for(int i=0;i<n;i++)
	{
		System.out.print(arr[i]);
		if(i!=n-1)System.out.print(" ");
	}
    }
}