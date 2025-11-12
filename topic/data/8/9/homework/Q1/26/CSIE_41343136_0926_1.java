class word//温禮全 41343136
{
public static void main(String[] args)//取得字串
{
	
 	for(int i=0;i<args.length;i++)
{
	System.out.print(args[i]);//輸出字串
	for (int j = 0; j < args[i].length(); j++) {
                char code = args[i].charAt(j);
				System.out.println((int)code);//輸出編碼
}
}
}
}