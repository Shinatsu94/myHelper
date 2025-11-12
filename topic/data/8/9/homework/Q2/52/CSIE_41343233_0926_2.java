/*檔案名稱:CSIE_41343233_0926_2
  作者:陳韋廷
  日期:09/26
  程式說明:印出一個選轉的棒子,並輸出進度
*/
public class CSIE_41343233_0926_2{
    public static void main(String[] args){
        for(int i=0;i<=100;i++){
            try {
                System.out.print("\r-");        
                Thread.sleep(100);
                System.out.print("\r/");        
                Thread.sleep(100);
                System.out.print("\r|");        
                Thread.sleep(100);
                System.out.print("\r\\");        
                Thread.sleep(100);
                System.out.print(i+"%");
            }   
            catch (InterruptedException e) {
                // 處理例外，例如印出堆疊追蹤
                e.printStackTrace();
            }
            
        }
    }
}