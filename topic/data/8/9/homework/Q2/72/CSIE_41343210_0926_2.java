public class CSIE_41343210_0926_2 {

    public static void main(String[] args) throws Exception {

        
        char[] spinnerChars = {'|', '/', '-', '\\'};
        System.out.println("棒子開始轉動了");

        // 這是一個會一直跑的迴圈
        while (true) {
            
            // 這個迴圈會把四個樣子一個一個印出來
            for (int i = 0; i < spinnerChars.length; i++) {
                
                // 把目前的棒子樣子印在畫面上
                System.out.print(spinnerChars[i]);

                // 讓電腦暫停一下下，不然它轉太快
                Thread.sleep(100);
                
                // 這個指令會讓電腦把手手移回最前面，準備印下一個樣子
                System.out.print('\r');
            }
        }
    }
}