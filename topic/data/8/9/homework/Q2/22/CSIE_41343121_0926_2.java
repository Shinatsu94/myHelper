public class CSIE_41343121_0926_2{ //41343121 徐唯祐 題目:旋轉棒子+進度條 日期:9/26




    public static void main(String[] args)  throws Exception {

       char ch1= '/';
       char ch2= '-';
       char ch3= '\\';
       char ch4= '|';
       int com=0;
       while(com<=100) {
             System.out.print("\t"+com+"%"); //顯示進度條
             System.out.print("\r"+ch1);     //棒子轉動
             Thread.sleep(50);               //延遲
             System.out.print("\r"+ch2);
             Thread.sleep(50);  
             System.out.print("\r"+ch3);
             Thread.sleep(50);  
             System.out.print("\r"+ch4);
             Thread.sleep(50);        
             com+=1;                         //進度條加一
    }
  }
}