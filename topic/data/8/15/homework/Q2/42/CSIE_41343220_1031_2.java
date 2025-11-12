import java.util.Scanner;
public class CSIE_41343220_1031_2
{
   public static void main(String[] args){
	Scanner sc =new Scanner(System.in);
	int big=0;
	
	int kal; 
	//System.out.print("輸入陣列大小");
	int input=sc.nextInt();
	
	int[] data=new int[input];
	
	for(int i=0;i<input;i++)
	{
	   data[i]=sc.nextInt();
	}	
	for (int i = 0; i < input - 1; i++) {
            int maxRight = data[i + 1];  
            for (int j = i + 1; j < input; j++) {
                if (data[j] > maxRight) {
                    maxRight = data[j];
                }
            }
            data[i] = maxRight; 
        }
	data[input-1]=-1;

	for(int i=0;i<input;i++)
	{
	   System.out.print(data[i]);
	   if(i<input-1)
	   {System.out.print(" ");}

	}

   }
}