import java.util.Scanner;
public class csie_41343239_1031_1
{
	public static void main(String avg[])
	{
 	Scanner sc= new Scanner(System.in);
	//System.out.print("請輸入陣列長度:");
	int length=sc.nextInt();
	int[] a= new int[length];
	//System.out.print("請輸入陣列的值:");
        for (int i = 0; i < length; i++) 
	{
    	a[i] = sc.nextInt();
        }
		//System.out.print("排序前:");
		for(int w=0;w<length;w++)
		//System.out.print(a[w] + " ");
		//System.out.print("\n");
		for (int i = 0; i < length - 1; i++) 
		{
           		for (int j = i + 1; j < length; j++) 
			{
               		 if (a[i] > a[j]) 
   			 {
                   	 int temp = a[i];
                   	 a[i] = a[j];
                   	 a[j] = temp;
			 }
                        }
                }
        
		//System.out.print("排序後:");
		for(int y=0;y<length;y++)
		{
		System.out.print(a[y]);
		if(y<(length-1)) System.out.print(" ");
                }
		sc.close();
		
	}
}
