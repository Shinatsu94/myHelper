import java.util.Scanner;
public class CSIE_41343136_1031_3b
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
	int h=s.nextInt();
        int num = s.nextInt();
	int max=0;
	for(int i=1;i<=h;i++)
	{
		max+=i;
	}
	if (num <= 0 || num >= 100000) 
	{
            System.out.printf("輸入的數字必須介於 1 到 99999 之間。");
            return;
        }
	if (num > max) 
	{
            System.out.printf("not find %d in array.",num);
            return;
        }
        int n = 1;
        while (n * (n + 1) / 2 < num) 
	{
            n++;
        }

        int row = n;
        int col = num - (n - 1) * n / 2;

        System.out.printf("%d[%d, %d]\n", num, row, col);
    }
}