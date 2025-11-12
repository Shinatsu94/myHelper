import java.util.Scanner;
public class CSIE_41343143_1031_1{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	int a=input.nextInt();
	input.nextLine();
	int temp;
	
	int array[]=new int[a];
	 String line = input.nextLine();
	String[] parts = line.split(" ");
	for(int w=0;w<array.length;w++)
	{
	 array[w] = Integer.parseInt(parts[w]);
	}
	for(int i=0;i<array.length-1;i++)
	{
	for(int j=0;j<array.length-1-i;j++)
	{
	if(array[j]>array[j+1]){
	temp=array[j];
	array[j]=array[j+1];
	array[j+1]=temp;
	}
	}
	}
	for(int k=0;k<array.length;k++)
	{
	System.out.print(array[k]+ " ");
	}
	}
}