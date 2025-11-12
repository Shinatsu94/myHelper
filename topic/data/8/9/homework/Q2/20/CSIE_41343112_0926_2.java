public class CSIE_41343112_0926_2{// 41343112 李宗懌 日期:0926 題目:選轉棒子+進度條
public static void main(String[] args)throws Exception{
char n0='|';
char n1='/';
char n2='-';
char n3='\\';
int Count=0;
while(Count<=100){//進度條到100%停止
System.out.print("\t"+Count+"%");//進度條顯示
System.out.print("\r"+n0);//__
Thread.sleep(40);//延遲       |
System.out.print("\r"+n1);//  | 
Thread.sleep(40);//           |
System.out.print("\r"+n2);//  |棒子轉動
Thread.sleep(40);//           |
System.out.print("\r"+n3);//  |
Thread.sleep(40);//         __|
Count+=1;//進度條增長

}

}
}