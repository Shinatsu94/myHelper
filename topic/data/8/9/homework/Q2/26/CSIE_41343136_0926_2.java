public class bar{
public static void main(String[] args)throws Exception
{
	char[] bar={'/','-','\\','|'};
	int i=0;
	while(true)
	{
		i++;
		System.out.print("\r"+bar[i]+" ");
		if(i==3)i=0;
		Thread.sleep(100);
	}
}
}