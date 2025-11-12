import java.util.Scanner;
public class CSIE_41343128_1003_3
{
   public static void main(String[] args)  {
    int a,all=0;
    Scanner scn=new Scanner(System.in);
    a=scn.nextInt();
    for(int i=0;i<=100000;i++)
    {
	int num=i;
	
	int sum=0;
	while(num>0)
	{
	sum=sum+num%10;
	num=num/10;
	}
     	if(sum==a)
	{
	all++;
 
	}
   }
       System.out.println(all);
  }
}
/*
2025/10/03
作者:陳廷鑫
最後編輯時間: 11:40
功能:位數的加總結果等於A
*/