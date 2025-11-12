import java.util.Scanner;
public class CSIE_41343107_1003_3
{
	public static void main(String args[])
	{
	Scanner same=new Scanner(System.in);
	int a;
	int sum=0;
 	a = same.nextInt();
	for(int i=1;i<=100000;i++){
	int c=0,b=i;
	        while (b!=0) {
                c = c+(b % 10);
                b = b/10;
            }
	if(c==a) {sum=sum+1;}
	}
	System.out.println(sum);
	}
} 
/*
 姓名: 王世豪
 學號: 41343107
 功能: 輸入一個數字A, 找尋 1 到 100000之間有多少數字每一個位數的加總結果等於A，輸出為1-100000之間，符合要求的數字數量
 日期: 2025/09/26
*/